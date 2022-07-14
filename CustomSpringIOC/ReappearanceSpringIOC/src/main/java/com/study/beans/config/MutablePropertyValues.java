package com.study.beans.config;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MutablePropertyValues implements Iterable<PropertyValue> {
    //在构造器进行初始化，可以有更多的选择
    private final List<PropertyValue> propertyValues;
    //初始化 propertyValues
    public MutablePropertyValues() {
        propertyValues = new ArrayList<>();
    }
    //提供构造器初始化方法
    public MutablePropertyValues(List<PropertyValue> propertyValues) {
        this.propertyValues = propertyValues;
    }
    //获取所有的 propertyValue，以数组的形式返回
    public PropertyValue[] getAllPropertyValues() {
        // toArray 方法默认返回类型是 Object，可以通过传入指定空数组的方式来规定返回类型
        return propertyValues.toArray(new PropertyValue[0]);
    }
    //根据名称返回 propertyValue
    public PropertyValue getPropertyValue(String name) {
        for (PropertyValue propertyValue : propertyValues) {
            if (propertyValue.getName().equals(name)) {
                return propertyValue;
            }
        }
        return null;
    }
    //添加 propertyValue，返回对象本身，实现链式编程
    public MutablePropertyValues addPropertyValue(PropertyValue propertyValue) {
        //如果是重复元素，直接覆盖，所以使用索引方法遍历
        for (int i = 0; i < propertyValues.size(); i++) {
            if (propertyValues.get(i).getName().equals(propertyValue.getName())) {
                propertyValues.set(i, propertyValue);
                return this;
            }
        }
        //没有重复元素就直接添加
        propertyValues.add(propertyValue);
        return this;
    }
    //检查是否已经存在
    public boolean contains(String name) {
        for (PropertyValue propertyValue : propertyValues) {
            if (propertyValue.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    //检查是否为空
    public boolean idEmpty() {
        return propertyValues.isEmpty();
    }

    //实现了 iterable 接口，提供获取迭代器的方法
    @Override
    public Iterator<PropertyValue> iterator() {
        //直接返回集合的迭代器
        return propertyValues.iterator();
    }

}
