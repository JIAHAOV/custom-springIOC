package com.study.abstractFactory;

import com.study.config.product.AbstractProduct;
import com.study.config.product.Phone;

public class PhoneFactory extends AbstractFactory{
    @Override
    public AbstractProduct createProduct() {
        return new Phone();
    }
}
