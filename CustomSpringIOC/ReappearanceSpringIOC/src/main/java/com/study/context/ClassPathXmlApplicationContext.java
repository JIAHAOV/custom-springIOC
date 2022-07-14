package com.study.context;

import com.study.beans.config.BeanDefinition;
import com.study.beans.config.MutablePropertyValues;
import com.study.beans.config.PropertyValue;
import com.study.context.support.BeanDefinitionRegister;
import com.study.utills.StringUtil;

import java.lang.reflect.Method;

public class ClassPathXmlApplicationContext extends AbstractApplicationContext{
    public ClassPathXmlApplicationContext(String configLocation) {
        this.configLocation = configLocation;
        //指定 BeanDefinitionReader
        this.beanDefinitionReader = new XmlBeanDefinitionReader();
        try {
            refresh();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object getBean(String beanName) throws Exception {
        //先检查是否存在
        Object obj = this.singletonObjects.get(beanName);
        if (obj != null) {
            return obj;
        }
        //如果不存在就创建
        BeanDefinitionRegister register = beanDefinitionReader.getRegister();
        //先获取 BeanDefinition
        BeanDefinition beanDefinition = register.getBeanDefinition(beanName);
        //不存在说明没有该 Bean
        if (beanDefinition == null) {
            return null;
        }
        //存在就通过 BeanDefinition 创建 Bean 对象
        String classPath = beanDefinition.getClassPath();
        Class<?> clazz = Class.forName(classPath);
        Object instance = clazz.getConstructor().newInstance();
        //通过 set 方法进行属性注入
        //先获取有哪些需要注入的属性
        MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
        for (PropertyValue propertyValue : propertyValues) {
            //获取字段名
            String name = propertyValue.getName();
            String value = propertyValue.getValue();
            String ref = propertyValue.getRef();
            //获取set方法名
            String methodName = StringUtil.getMethodNameByField(name);
            if (ref != null && !ref.isEmpty()) {
                //不知道参数类型，先获取所有方法
                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                    if (method.getName().equals(methodName)) {
                        Object bean = getBean(ref);
                        method.invoke(instance, bean);
                    }
                }
            } else if (value != null && !value.isEmpty()) {
                //字符串直接注入
                Method method = clazz.getMethod(methodName, String.class);
                method.invoke(instance, value);
            }

        }
        //将创建好的Bean进行存储
        singletonObjects.put(beanName, instance);
        return instance;
    }

    @Override
    public <T> T getBean(String beanName, Class<? extends T> clazz) throws Exception {
        Object bean = getBean(beanName);
        if (bean == null) {
            return null;
        }
        //使用cast()方法进行类型转换
        return clazz.cast(bean);
    }
}
