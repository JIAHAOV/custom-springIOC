package com.study;

import com.study.code.Context;
import org.junit.jupiter.api.Test;

public class Client {
    @Test
    public void test() {
        //创建上下文
        Context context = new Context();
        //设置初始状态为运行状态
        context.setState(Context.RUN);
        //调用方法，上下文状态会自动改变
        context.run();
        context.stop();
        context.run();
    }
}
