package com.study.component;

public class FriedNoodles extends FastFood{
    public FriedNoodles() {
        super(5.0, "炒面");
    }
    @Override
    public void total() {
        System.out.println(getDescription() + " : " + getPrice());
    }
}
