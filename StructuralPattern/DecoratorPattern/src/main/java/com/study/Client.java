package com.study;

import com.study.component.FastFood;
import com.study.component.FriedRice;
import com.study.decorator.Bacon;
import com.study.decorator.Egg;

public class Client {
    public static void main(String[] args) {
        FastFood food = new FriedRice();
        food.total();//炒饭 : 10.0
        System.out.println();
        food = new Egg(food);
        food.total();//鸡蛋炒饭 : 11.0
        System.out.println();
        food = new Bacon(food);
        food.total();//培根鸡蛋炒饭 : 13.0
    }
}
