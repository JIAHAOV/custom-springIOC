package com.study.classAdapter;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SdAdapterTf tf = new SdAdapterTf();
        tf.writeTF("this is tf");
        System.out.println("------------------------");
        computer.readSD(tf);
    }
}
