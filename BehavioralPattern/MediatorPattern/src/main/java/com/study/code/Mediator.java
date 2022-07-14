package com.study.code;

import java.util.Vector;

/**
 * 抽象中介者类
 */
public abstract class Mediator {
    //存储对哪些成员进行中介
    protected static final Vector<Colleague> list = new Vector<>();
    //转发消息
    public abstract void mediator(String name, String message);
    //添加需要中介的成员
    public void addColleague(Colleague colleague) {
        list.add(colleague);
    }
}
