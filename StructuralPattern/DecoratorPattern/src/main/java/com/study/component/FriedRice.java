package com.study.component;

public class FriedRice extends FastFood{
    public FriedRice() {
        super(10.0, "炒饭");
    }
    @Override
    public void total() {
        System.out.println(getDescription() + " : " + getPrice());
    }
}
