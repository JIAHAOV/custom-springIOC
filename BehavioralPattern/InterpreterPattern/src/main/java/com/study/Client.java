package com.study;

import com.study.code.*;
import org.junit.jupiter.api.Test;

public class Client {
    @Test
    public void test() {
        //创建上下文存储元素
        Context context = new Context();
        Variable a = new Variable("a", 1.0);
        Variable b = new Variable("b", 2.0);
        Variable c = new Variable("c", 3.0);
        Variable d = new Variable("d", 4.0);
        //将元素存储进上下文
        context.addValue(a);
        context.addValue(b);
        context.addValue(c);
        context.addValue(d);
        //创建抽象语法树
        AbstractExpression expression = new Plus(a, new Minus(new Plus(b, c), d));
        double result = expression.interpret(context);
        System.out.println(expression + " = " + result);
    }
}
