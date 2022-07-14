package com.study.code.element;

import com.study.code.vsitor.Person;

public class Keyboard implements ComputerPart{
    @Override
    public void accept(Person person) {
        person.action(this);
        System.out.println(person.getClass().getSimpleName() + "操作了" + this.getClass().getSimpleName());
    }
}
