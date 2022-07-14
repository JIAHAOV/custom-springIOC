package com.study.code;

/**
 * 环境上下文，记录当前状态
 */
public class Context {
    public static final State RUN = new RunState();
    public static final State STOP = new StopState();
    //用来存储当前状态
    private State state;
    public void setState(State state) {
        //设置该状态属于当前上下文
        state.setContext(this);
        this.state = state;
    }
    //正常调用状态的方法
    public void run() {
        state.run();
    }
    public void stop() {
        state.stop();
    }
}
