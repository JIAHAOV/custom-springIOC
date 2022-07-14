package com.study.code;

public class RunState extends State{
    @Override
    public void stop() {
        System.out.println("停止");
        //将上下文状态设置为停止状态
        getContext().setState(Context.STOP);
    }
    @Override
    public void run() {
    }
}
