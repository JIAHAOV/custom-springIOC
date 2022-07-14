package com.study.code;

import com.study.code.element.ComputerPart;
import com.study.code.element.Keyboard;
import com.study.code.element.Mouse;
import com.study.code.vsitor.Person;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<ComputerPart> list = new ArrayList<>();
    public Computer() {
        list.add(new Mouse());
        list.add(new Keyboard());
    }
    public void accept(Person person) {
        for (ComputerPart computerPart : list) {
            computerPart.accept(person);
        }
    }
}
