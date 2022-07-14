package com.study.code.vsitor;

import com.study.code.element.Keyboard;
import com.study.code.element.Mouse;

public class Master extends Person{
    public Master(String name) {
        super(name);
    }
    @Override
    public void action(Mouse mouse) {
        System.out.println(name + " move " + mouse.getClass().getSimpleName());
    }
    @Override
    public void action(Keyboard keyboard) {
        System.out.println(name + " knock " + keyboard.getClass().getSimpleName());
    }
}
