package com.study.decorator;

import com.study.component.FastFood;
import lombok.Getter;
import lombok.Setter;

public abstract class Garnish extends FastFood{
    @Getter
    @Setter
    private FastFood fastFood;
    public Garnish(double price, String description, FastFood fastFood) {
        super(price, description);
        this.fastFood = fastFood;
    }
    @Override
    public abstract void total();
}
