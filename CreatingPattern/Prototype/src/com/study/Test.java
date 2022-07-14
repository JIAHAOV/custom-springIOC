package com.study;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        House house = new House(new Person("tom"), "北京");
        House clone = house.clone();
        clone.person.name = "jack";
        clone.address = "上海";
        house.show();
        clone.show();
    }
}
