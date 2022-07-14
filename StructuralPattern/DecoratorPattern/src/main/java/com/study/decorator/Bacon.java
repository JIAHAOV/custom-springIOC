package com.study.decorator;

import com.study.component.FastFood;

public class Bacon extends Garnish{
    public Bacon(FastFood fastFood) {
        super(2, "培根", fastFood);
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
