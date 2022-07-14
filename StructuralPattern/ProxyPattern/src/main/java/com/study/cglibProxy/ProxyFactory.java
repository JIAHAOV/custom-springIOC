package com.study.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

class ProxyFactory<T> implements MethodInterceptor {

    private T obj;

    public T createProxy(T obj) {
        this.obj = obj;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(obj.getClass());
        enhancer.setCallback(this);
        T proxyInstance = (T) enhancer.create();
        return proxyInstance;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before");
        Object invoke = method.invoke(obj, objects);
        System.out.println("after");
        return invoke;
    }
}
