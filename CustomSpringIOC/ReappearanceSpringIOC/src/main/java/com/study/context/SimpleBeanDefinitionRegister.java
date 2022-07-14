package com.study.context;

import com.study.beans.config.BeanDefinition;
import com.study.context.support.BeanDefinitionRegister;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SimpleBeanDefinitionRegister implements BeanDefinitionRegister {
    //存储beanDefinition对象
    private final Map<String, BeanDefinition> beanDefinitions;
    public SimpleBeanDefinitionRegister() {
        beanDefinitions = new ConcurrentHashMap<>();
    }
    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitions.put(beanName, beanDefinition);
    }
    @Override
    public void removeBeanDefinition(String beanName) throws Exception {
        beanDefinitions.remove(beanName);
    }
    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws Exception {
        BeanDefinition beanDefinition = beanDefinitions.get(beanName);
        return beanDefinition;
    }
    @Override
    public boolean containsBeanDefinition(String beanName) {
        return beanDefinitions.containsKey(beanName);
    }
    @Override
    public int getBeanDefinitionCount() {
        return beanDefinitions.size();
    }
    @Override
    public String[] getBeanDefinitionNames() {
        String[] names = beanDefinitions.keySet().toArray(new String[0]);
        return names;
    }
}
