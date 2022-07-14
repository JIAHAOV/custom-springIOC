package com.study;

import com.study.code.ConcreteCommand;
import com.study.code.Invoker;
import com.study.code.Receiver;
import com.study.runnable.RunnableCommand;
import org.junit.jupiter.api.Test;

public class Client {
    @Test
    public void testCommand() {
        //创建命令接收者
        Receiver receiver = new Receiver();
        //创建具体命令
        ConcreteCommand command = new ConcreteCommand(receiver);
        //创建命令发起者
        Invoker invoker = new Invoker(command);
        //命令发起者发起命令，由接收者执行
        invoker.action();
    }

    /**
     * Runnable 就是命令模式，不过接收者需要自己去定义
     * Runnable相当于命令的抽象。
     * 实际上调用线程的start以后，就有资格去抢cpu的资源，不要去写获取cpu资源的逻辑，抢到cpu资源以后执行run方法中的内容。
     * Runnable接口把用户请求和cpu执行进行解耦。
     */
    @Test
    public void testRunnable() {
        Receiver receiver = new Receiver();
        RunnableCommand command = new RunnableCommand(receiver);
        Thread thread = new Thread(command);
        thread.start();
    }
}
