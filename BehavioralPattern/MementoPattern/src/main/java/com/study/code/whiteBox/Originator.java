package com.study.code.whiteBox;

import lombok.Data;

/**
 * 发起者对象
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
        Memento memento = new Memento(count, state);
        return memento;
    }
    //恢复状态
    public void recoveryToMemento(Memento memento) {
        this.count = memento.getCount();
        this.state = memento.getState();
    }
}
