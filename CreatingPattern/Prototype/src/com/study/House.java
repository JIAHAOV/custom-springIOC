package com.study;

public class House implements Cloneable {
    Person person;
    String address;
    public House(Person person, String address) {
        this.person = person;
        this.address = address;
    }
    @Override
    protected House clone() throws CloneNotSupportedException {
        House clone = (House) super.clone();
        clone.person = clone.person.clone();
        return clone;
    }
    public void show() {
        System.out.println("address: " + address + ", name: " + person.name);
    }
}
