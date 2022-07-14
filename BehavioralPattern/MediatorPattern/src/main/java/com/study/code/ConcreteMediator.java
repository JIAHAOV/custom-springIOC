package com.study.code;

/**
 * 具体的中介者实现
 */
public class ConcreteMediator extends Mediator{
    @Override
    public void mediator(String name, String message) {
        //根据名称转发消息
        for (Colleague colleague : list) {
            if (colleague.getName().equals(name)) {
                colleague.receive(message);
            }
        }
    }
}
