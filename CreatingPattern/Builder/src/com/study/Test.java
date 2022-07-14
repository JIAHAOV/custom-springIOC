package com.study;

public class Test {
    public static void main(String[] args) {
        Phone phone = new Phone.PhoneBuilder()
                .setCpu("cpu")
                .setMainBoard("mainBoard")
                .setMemory("memory")
                .setScreen("screen")
                .build();
        System.out.println(phone);
    }
}
