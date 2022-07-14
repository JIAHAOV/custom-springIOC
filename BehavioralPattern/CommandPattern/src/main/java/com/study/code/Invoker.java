package com.study.code;

import lombok.AllArgsConstructor;
import lombok.Setter;

/**
 * 命令请求者
 */
@AllArgsConstructor
public class Invoker {
    //指定命令发起者发出的命令
    @Setter
    private Command command;
    public void action() {
        command.execute();
    }
}
