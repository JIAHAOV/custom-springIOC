package com.study.context;


import com.study.context.support.ApplicationContext;
import com.study.context.support.BeanDefinitionReader;
import com.study.context.support.BeanDefinitionRegister;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractApplicationContext implements ApplicationContext{
    //用以存储创建好的 Bean 对象
    protected final Map<String, Object> singletonObjects = new ConcurrentHashMap<>();
    //定义解析器，因为目前还不知道解析器类型，所以先不指定
    protected BeanDefinitionReader beanDefinitionReader;
    //配置文件名称
    protected String configLocation;

    @Override
    public void refresh() throws Exception {
        //加载配置文件
        beanDefinitionReader.loadBeanDefinitions(configLocation);
        //初始化Bean
        finishBeanInitialization();
    }

    private void finishBeanInitialization() throws Exception {
        //获取所以的BeanName
        BeanDefinitionRegister register = beanDefinitionReader.getRegister();
        String[] beanNames = register.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            //第一次获取会进行初始化
            getBean(beanName);
        }
    }
}
