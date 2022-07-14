package com.study.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Variable extends AbstractExpression{
    private String name;
    @Getter
    private Double value;
    @Override
    public double interpret(Context context) {
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
