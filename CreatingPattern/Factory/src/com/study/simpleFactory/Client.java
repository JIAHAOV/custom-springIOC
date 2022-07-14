package com.study.simpleFactory;

import com.study.config.product.AbstractProduct;

//封装一层，不必修改业务代码
public class Client {
    public AbstractProduct getProduct(String name) {
        Factory factory = new Factory();
        return factory.getBean(name);
    }
}
