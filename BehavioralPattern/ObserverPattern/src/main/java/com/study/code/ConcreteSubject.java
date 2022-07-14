package com.study.code;

import java.util.Vector;

/**
 * 具体被观察者
 */
public class ConcreteSubject implements Subject{
    private final Vector<Observer> listeners = new Vector<>();
    @Override
    public void addObserver(Observer observer) {
        listeners.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        boolean remove = listeners.remove(observer);
        if (!remove) {
            System.out.println(observer.getClass().getName() + "不存在");
        }
    }
    @Override
    public void notifyAll(String message) {
        for (Observer listener : listeners) {
            new Thread(() -> {listener.update(message);}).start();
        }
    }
}
