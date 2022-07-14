package com.study.code;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 抽象”同事“类
 */
@Data
@AllArgsConstructor
public abstract class Colleague {
    protected String name;
    //保存中介者
    protected Mediator mediator;
    //发送消息
    public abstract void sendMessage(String name, String message);
    //接收消息，由中介者调用
    public abstract void receive(String message);
}
