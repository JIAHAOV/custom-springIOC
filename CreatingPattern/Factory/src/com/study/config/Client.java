package com.study.config;

import com.study.config.factory.ConfigFactory;
import com.study.config.product.AbstractProduct;

public class Client {
    public static void main(String[] args) {
        AbstractProduct phone = ConfigFactory.getBean("computer");
        System.out.println(phone.getName());
    }
}
