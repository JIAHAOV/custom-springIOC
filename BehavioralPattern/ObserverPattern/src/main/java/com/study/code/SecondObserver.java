package com.study.code;

/**
 * 具体的观察者实现
 */
public class SecondObserver implements Observer{
    @Override
    public void update(String message) {
        System.out.println("第二个观察者更新: " + message);
    }
    @Override
    public int hashCode() {
        return SecondObserver.class.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return obj instanceof SecondObserver;
    }
}
