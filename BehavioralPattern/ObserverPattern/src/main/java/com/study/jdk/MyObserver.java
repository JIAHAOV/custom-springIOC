package com.study.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Observer 接口是JDK提供的抽象观察者
 * 监视目标对象的变化，当目标对象发生变化时，观察者得到通知，并调用 update 方法，进行相应的工作。
 */
public class MyObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        MyObservable observable = (MyObservable) o;
        System.out.println("观察到" + observable.getName() + "发生变化,信息为 " + arg);
    }
}
