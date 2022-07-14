package com.study.code;

/**
 * 第一个节点
 */
public class FirstHandler extends Handler{
    public FirstHandler(Handler nextHandler) {
        super(Handler.NUM_ONE, nextHandler);
    }
    @Override
    protected void action(String message) {
        System.out.println("第一个节点进行处理");
    }
}
