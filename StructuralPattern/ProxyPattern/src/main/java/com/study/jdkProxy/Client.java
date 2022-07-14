package com.study.jdkProxy;

import com.study.cglibProxy.SellTicket;
import com.study.cglibProxy.TrainStation;

class Client {
    public static void main(String[] args) {
        SellTicket proxyInstance = ProxyFactory.getProxyInstance(new TrainStation());
        proxyInstance.sell();
        System.out.println(proxyInstance);
    }
}
