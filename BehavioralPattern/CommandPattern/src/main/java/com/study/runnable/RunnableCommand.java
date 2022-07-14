package com.study.runnable;

import com.study.code.Receiver;
import lombok.AllArgsConstructor;
import lombok.Setter;

/**
 * Runnable 就属于命令模式
 */
@AllArgsConstructor
public class RunnableCommand implements Runnable{
    @Setter
    private Receiver receiver;
    @Override
    public void run() {
        receiver.action();
    }
}
