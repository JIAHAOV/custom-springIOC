package com.study.code;

import lombok.AllArgsConstructor;
import lombok.Setter;

/**
 * 命令的具体实现
 */
@AllArgsConstructor
public class ConcreteCommand implements Command{
    //指定命令的接收者
    @Setter
    private Receiver receiver;
    @Override
    public void execute() {
        receiver.action();
    }
}
