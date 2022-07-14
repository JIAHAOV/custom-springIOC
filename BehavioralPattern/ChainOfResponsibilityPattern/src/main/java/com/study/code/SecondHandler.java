package com.study.code;

/**
 * 第二个节点
 */
public class SecondHandler extends Handler{
    public SecondHandler(Handler nextHandler) {
        super(Handler.NUM_TWO, nextHandler);
    }
    @Override
    protected void action(String message) {
        System.out.println("第二个节点进行处理");
    }
}
