package com.study;

import com.study.code.ConcreteSubject;
import com.study.code.FirstObserver;
import com.study.code.SecondObserver;
import com.study.jdk.MyObservable;
import com.study.jdk.MyObserver;
import org.junit.jupiter.api.Test;

public class Client {
    @Test
    public void test() {
        //创建被观察者
        ConcreteSubject subject = new ConcreteSubject();
        //添加观察者
        subject.addObserver(new FirstObserver());
        subject.addObserver(new SecondObserver());
//        subject.removeObserver(new SecondObserver());
        //进行通知
        subject.notifyAll("message");
    }
    @Test
    public void testJDK() {
        //创建目标类
        MyObservable observable = new MyObservable("rose");
        //创建观察者
        MyObserver observer = new MyObserver();
        //将观察者添加到目标类
        observable.addObserver(observer);
        //调用目标类的方法
        observable.action();
    }
}
