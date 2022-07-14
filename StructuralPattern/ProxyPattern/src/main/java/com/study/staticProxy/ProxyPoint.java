package com.study.staticProxy;

import com.study.cglibProxy.SellTicket;
import com.study.cglibProxy.TrainStation;

public class ProxyPoint implements SellTicket {

    private TrainStation trainStation = new TrainStation();
    @Override
    public void sell() {
        System.out.println("==============");

    }
}
