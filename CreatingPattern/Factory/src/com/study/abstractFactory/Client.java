package com.study.abstractFactory;

import com.study.config.product.AbstractProduct;

public class Client {

    private AbstractFactory factory;

    public Client(AbstractFactory factory) {
        this.factory = factory;
    }

    AbstractProduct getProduct() {
        return factory.createProduct();
    }

    public static void main(String[] args) {
        Client client = new Client(new PhoneFactory());
        AbstractProduct phone = client.getProduct();
        System.out.println(phone);
        client = new Client(new ComputerFactory());
        AbstractProduct computer = client.getProduct();
        System.out.println(computer);
    }

}
