package com.study.staticProxy;

import com.study.cglibProxy.SellTicket;

class Client {
    public static void main(String[] args) {
        SellTicket proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }
}
