package com.study;

import com.study.code.FirstHandler;
import com.study.code.Handler;
import com.study.code.SecondHandler;
import com.study.code.ThirdHandler;
import org.junit.jupiter.api.Test;

public class Client {
    /**
     * 责任链模式避免请求发送者与多个接收者耦合在一起，让多个对象都有可能接收请求，
     * 将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止。
     */
    @Test
    public void test() {
        Handler handlerChain = getHandlerChain();
        handlerChain.handle(3, "test");
    }

    public Handler getHandlerChain() {
        //创建各个节点
        ThirdHandler thirdHandler = new ThirdHandler(null);
        SecondHandler secondHandler = new SecondHandler(thirdHandler);
        FirstHandler firstHandler = new FirstHandler(secondHandler);
        return firstHandler;
    }
}
