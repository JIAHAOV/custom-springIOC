package com.study.beans;

public interface BeanFactory {
    //根据名称获取 Bean 对象
    Object getBean(String beanName) throws Exception;
    //根据名称获取 Bean 对象，并进行类型转换
    <T> T getBean(String beanName, Class<? extends T> clazz) throws Exception;
}
