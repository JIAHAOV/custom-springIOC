package com.study.abstractFactory;

import com.study.config.product.AbstractProduct;
import com.study.config.product.Computer;

public class ComputerFactory extends AbstractFactory {
    @Override
    public AbstractProduct createProduct() {
        return new Computer();
    }
}
