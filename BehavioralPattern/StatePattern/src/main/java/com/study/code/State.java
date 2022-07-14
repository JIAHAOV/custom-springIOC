package com.study.code;

import lombok.Data;

/**
 * 将状态抽离出来，提取出一个抽象类
 */
@Data
public abstract class State {
    //当前状态所属的上下文
    private Context context;
    public abstract void stop();
    public abstract void run();
}
