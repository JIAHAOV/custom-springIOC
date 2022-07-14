package com.study.context;

import com.study.beans.config.BeanDefinition;
import com.study.beans.config.MutablePropertyValues;
import com.study.beans.config.PropertyValue;
import com.study.context.support.BeanDefinitionReader;
import com.study.context.support.BeanDefinitionRegister;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

public class XmlBeanDefinitionReader implements BeanDefinitionReader {
    //创建注册表，存储加载的BeanDefinition对象
    private final BeanDefinitionRegister beanDefinitionRegister;
    public XmlBeanDefinitionReader() {
        beanDefinitionRegister = new SimpleBeanDefinitionRegister();
    }
    @Override
    public BeanDefinitionRegister getRegister() {
        return beanDefinitionRegister;
    }

    @Override
    public void loadBeanDefinitions(String configLocation) throws Exception {
        //根据配置文件名获取输入流
        InputStream is = XmlBeanDefinitionReader.class.getClassLoader().getResourceAsStream(configLocation);
        //创建读取XMl的对象
        SAXReader reader = new SAXReader();
        //读取XML文件
        Document document = reader.read(is);
        //获取根标签
        Element rootElement = document.getRootElement();
        //解析bean
        parseBean(rootElement);
    }

    public void parseBean(Element rootElement) {
        //获取 bean 标签
        List<Element> beanElement = rootElement.elements("bean");
        for (Element element : beanElement) {
            //创建 BeanDefinition对象
            BeanDefinition beanDefinition = new BeanDefinition();
            //获取标签内属性
            String beanName = element.attributeValue("id");
            String classPath = element.attributeValue("class");
            //解析Bean标签中的property标签
            MutablePropertyValues propertyValues = new MutablePropertyValues();
            List<Element> properties = element.elements("property");
            for (Element property : properties) {
                //获取属性
                String name = property.attributeValue("name");
                String value = property.attributeValue("value");
                String ref = property.attributeValue("ref");
                //创建propertyValue对象
                PropertyValue propertyValue = new PropertyValue(name, value, ref);
                propertyValues.addPropertyValue(propertyValue);
            }
            //初始化 BeanDefinition 的属性
            beanDefinition.setBeanName(beanName);
            beanDefinition.setClassPath(classPath);
            beanDefinition.setPropertyValues(propertyValues);
            //将 BeanDefinition 存储进注册表
            beanDefinitionRegister.registerBeanDefinition(beanName, beanDefinition);
        }
    }
}
