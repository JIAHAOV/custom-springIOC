package com.study.ruin;

import com.study.demo5.Singleton;

import java.lang.reflect.Constructor;

public class ByReflect {
    public static void main(String[] args) throws Exception {
        Singleton instance = Singleton.getInstance();
        //获取类对象
        Class<? extends Singleton> clazz = instance.getClass();
        //获取Singleton类的私有无参构造方法对象，注意要用 getDeclaredConstructor()
        Constructor<? extends Singleton> constructor = clazz.getDeclaredConstructor();
        //取消访问检查
        constructor.setAccessible(true);
        //创建对象
        Singleton singleton = constructor.newInstance();
        //发现破坏了单例模式
        System.out.println(singleton);
        System.out.println(instance);
        //可以通过在构造函数内判断是否已经被创建了，如果被创建了就抛异常来解决
    }
}
