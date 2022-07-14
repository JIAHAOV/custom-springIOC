package com.study.code.whiteBox;

import java.util.Stack;

/**
 * 对备忘录进行管理
 */
public class Caretaker {
    private final Stack<Memento> mementos = new Stack<>();
    public void saveMemento(Memento memento) {
        mementos.push(memento);
    }
    public Memento getMemento() {
        Memento memento = mementos.pop();
        return memento;
    }
}
