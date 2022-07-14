package com.study.code.whiteBox;

import org.junit.jupiter.api.Test;

public class Client {
    @Test
    public void testWhite() {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        //记录一次状态
        caretaker.saveMemento(originator.saveToMemento());
        //改变状态
        originator.low(10);
        //记录第二次状态
        caretaker.saveMemento(originator.saveToMemento());
        //改变状态
        originator.low(10);
        System.out.println("当前状态:" + originator);
        originator.recoveryToMemento(caretaker.getMemento());
        System.out.println("恢复后:" + originator);
        originator.recoveryToMemento(caretaker.getMemento());
        System.out.println("恢复后:" + originator);
    }

}
