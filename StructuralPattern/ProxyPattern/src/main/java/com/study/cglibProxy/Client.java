package com.study.cglibProxy;

public class Client {
    public static void main(String[] args) {
        TrainStation trainStation = new TrainStation();
        ProxyFactory<TrainStation> proxyFactory = new ProxyFactory<TrainStation>();
        TrainStation proxyInstance = proxyFactory.createProxy(trainStation);
        proxyInstance.sell();
    }
}
