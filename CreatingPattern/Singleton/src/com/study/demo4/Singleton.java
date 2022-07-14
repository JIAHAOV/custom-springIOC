package com.study.demo4;

/**
 * 懒汉式式
 * 双重检查锁
 */
public class Singleton {
    //为了避免JVM的优化机制造成的空指针问题，要使用 volatile 关键字
    private static volatile Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        //由于绝大部分的操作都是读操作，读操作是线程安全的，所以没必要对整个方法进行同步
        //第一次检查，是否为空，不为空直接返回，节省效率
        if (instance == null) {
            synchronized (Singleton.class) {
                //第二次检查，是否为空（多线程的漏网之鱼）
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
