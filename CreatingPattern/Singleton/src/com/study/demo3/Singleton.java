package com.study.demo3;

/**
 * 懒汉式
 * 线程安全
 * 效率不高
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
