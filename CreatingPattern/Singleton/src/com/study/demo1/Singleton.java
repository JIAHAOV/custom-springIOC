package com.study.demo1;

/**
 * 饿汉式
 */
public class Singleton {

    private static  final Singleton instance = new Singleton();
//    //也可使用静态代码块进行加载
//    static {
//        instance = new Singleton();
//    }

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }
}
