package com.study.code;

/**
 * 具体的观察者实现
 */
public class FirstObserver implements Observer{
    @Override
    public void update(String message) {
        System.out.println("第一个观察者更新: " + message);
    }
    //为了能正确移除，重写了 hashcode 和 equals 方法。
    @Override
    public int hashCode() {
        return FirstObserver.class.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return obj instanceof FirstObserver;
    }
}
