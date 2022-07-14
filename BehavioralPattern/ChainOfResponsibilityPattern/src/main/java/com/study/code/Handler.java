package com.study.code;

import lombok.AllArgsConstructor;

/**
 * 每个节点的抽象
 */
@AllArgsConstructor
public abstract class Handler {
    protected static final int NUM_ONE = 1;
    protected static final int NUM_TWO = 2;
    protected static final int NUM_THREE = 3;
    //节点的级别
    private int level;
    //下一个节点
    private Handler nextHandler;
    //如何处理
    protected abstract void action(String message);
    /**
     * 出来调用，如果本对象不能处理，就传到下一个节点
     * @param level 级别
     * @param message 信息
     */
    public final void handle(int level, String message) {
        if (level == this.level) {
            action(message);
        } else {
            if (nextHandler != null) {
                nextHandler.handle(level, message);
            }
        }
    }
}
