package com.study.cglibProxy;

public class TrainStation implements SellTicket {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }

    @Override
    public String toString() {
        System.out.println("toString");
        return super.toString();
    }
}
