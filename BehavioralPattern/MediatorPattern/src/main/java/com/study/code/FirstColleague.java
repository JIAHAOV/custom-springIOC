package com.study.code;

import java.util.Objects;

/**
 * 实现类
 */
public class FirstColleague extends Colleague{
    public FirstColleague(String name, Mediator mediator) {
        super(name, mediator);
    }
    @Override
    public void sendMessage(String name, String message) {
        mediator.mediator(name, message);
    }
    @Override
    public void receive(String message) {
        System.out.println(this.name + " : " + message);
    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(getName());
//    }
//    @Override
//    public boolean equals(Object o) {
//        if (o instanceof FirstColleague) {
//            FirstColleague colleague = (FirstColleague) o;
//            return this.getName().equals(colleague.getName());
//        } else {
//            return false;
//        }
//    }
}
