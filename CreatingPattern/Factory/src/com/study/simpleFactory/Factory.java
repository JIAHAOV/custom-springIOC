package com.study.simpleFactory;

import com.study.config.product.AbstractProduct;
import com.study.config.product.Computer;
import com.study.config.product.Phone;

public class Factory {

    public AbstractProduct getBean(String name) {
        if ("phone".equals(name)) {
            return new Phone();
        } else if ("computer".equals(name)) {
            return new Computer();
        } else {
            throw new RuntimeException("notFound");
        }
    }
}
