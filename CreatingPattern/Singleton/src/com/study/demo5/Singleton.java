package com.study.demo5;

import java.io.Serializable;

/**
 * 懒汉式
 * 利用静态内部类的加载机制
 */
public class Singleton implements Serializable {

    private Singleton() {

    }

    //JVM 在加载外部类的过程中, 是不会加载静态内部类的, 只有内部类的属性/方法被调用时才会被加载,
    private static class SingletonHolder {
        //静态属性由于被 `static` 修饰，保证只被实例化一次
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    //解决序列化破环单例模式的问题
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}
