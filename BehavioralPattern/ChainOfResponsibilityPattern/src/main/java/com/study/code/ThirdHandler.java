package com.study.code;

/**
 * 第三个节点
 */
public class ThirdHandler extends Handler {
    public ThirdHandler(Handler nextHandler) {
        super(Handler.NUM_THREE, nextHandler);
    }

    @Override
    protected void action(String message) {
        System.out.println("第三个节点进行处理");
    }
}
