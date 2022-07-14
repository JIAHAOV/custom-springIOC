package com.study;

public class Person implements Cloneable{
    String name;
    public Person(String name) {
        this.name = name;
    }
    public Person() { }
    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}
