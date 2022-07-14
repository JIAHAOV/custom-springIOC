package com.study.code;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Minus extends AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;
    @Override
    public double interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }

    @Override
    public String toString() {
        return left.toString() + " - " + right.toString();
    }
}
