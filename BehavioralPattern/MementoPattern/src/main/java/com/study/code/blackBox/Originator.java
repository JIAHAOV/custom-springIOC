package com.study.code.blackBox;

import lombok.Data;

/**
 * 发起者对象
 * 黑箱备忘录模式，将备忘录实现类声明成内部类，使外界无法获取备忘录中的数据
 */
@Data
public class Originator {
    private int count;
    private String state;
    public Originator() {
        count = 100;
        state = "run";
    }
    public void low(int num) {
        count -= num;
        state = "stop";
    }
    //存储当前状态
    public Memento saveToMemento() {
        Memento memento = new MyMemento(count, state);
        return memento;
    }
    //恢复状态
    public void recoveryToMemento(Memento memento) {
        MyMemento myMemento = (MyMemento) memento;
        this.count = myMemento.count;
        this.state = myMemento.state;
    }
    private class MyMemento implements Memento {
        private final int count;
        private final String state;
        private MyMemento(int count, String state) {
            this.count = count;
            this.state = state;
        }
    }
}
