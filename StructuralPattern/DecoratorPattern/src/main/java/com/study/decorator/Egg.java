package com.study.decorator;

import com.study.component.FastFood;

public class Egg extends Garnish{
    public Egg(FastFood fastFood) {
        super(1, "鸡蛋", fastFood);
    }
    @Override
    public double getPrice() {
        return super.getPrice() + getFastFood().getPrice();
    }
    @Override
    public String getDescription() {
        return super.getDescription() + getFastFood().getDescription();
    }
    @Override
    public void total() {
        System.out.println(getDescription() + " : " + getPrice());
    }
}
