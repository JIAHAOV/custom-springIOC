package com.study.beans.config;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BeanDefinition {
    //bean的id，即名称
    private String beanName;
    //class路径
    private String classPath;
    //有哪些property标签
    private MutablePropertyValues propertyValues;
    public BeanDefinition() {
        propertyValues = new MutablePropertyValues();
    }
}
