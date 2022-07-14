package com.study.jdk;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Observable;

/**
 * Observable 类是JDK提供的抽象目标类
 * void addObserver(Observer o) 方法：用于将新的观察者对象添加到集合中。
 * void notifyObservers(Object arg) 方法：调用集合中的所有观察者对象的 update方法，通知它们数据发生改变。通常越晚加入集合的观察者越先得到通知。
 * void setChange() 方法：用来设置一个 boolean 类型的内部标志，注明目标对象发生了变化。当它为true时，notifyObservers() 才会通知观察者。
 */
@Data
@AllArgsConstructor
public class MyObservable extends Observable {
    private String name;
    public void action() {
        System.out.println("被观察者发生变化");
        super.setChanged();
        super.notifyObservers("行动");
    }
}
