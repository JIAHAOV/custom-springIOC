package com.study.code;

public class StopState extends State{
    @Override
    public void stop() {
    }
    @Override
    public void run() {
        System.out.println("运行");
        //将上下文状态设置为运行状态
        getContext().setState(Context.RUN);
    }
}
