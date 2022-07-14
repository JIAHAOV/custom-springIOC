package com.study.simpleFactory;

import com.study.config.product.AbstractProduct;

public class Test {
    public static void main(String[] args) {
        Client client = new Client();
        AbstractProduct phone = client.getProduct("phone");
        System.out.println(phone.getName());
    }
}
