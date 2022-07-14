package com.study.context.support;

public interface BeanDefinitionReader {
    //获取 Bean 注册表
    BeanDefinitionRegister getRegister();
    //根据配置文件加载 beanDefinition
    void loadBeanDefinitions(String configLocation) throws Exception;
}
