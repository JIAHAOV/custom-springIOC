package com.study.jdkProxy;

import com.study.cglibProxy.SellTicket;

import java.lang.reflect.Proxy;

class ProxyFactory {

    public static SellTicket getProxyInstance(SellTicket obj) {
        Class<? extends SellTicket> clazz = obj.getClass();
        return (SellTicket) Proxy.newProxyInstance(
                clazz.getClassLoader(),
                clazz.getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("before");
                    Object invoke = method.invoke(obj, args);
                    System.out.println("after");
                    return invoke;
                });
    }
}
