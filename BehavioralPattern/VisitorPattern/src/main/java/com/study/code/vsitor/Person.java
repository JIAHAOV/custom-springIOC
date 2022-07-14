package com.study.code.vsitor;

import com.study.code.element.Keyboard;
import com.study.code.element.Mouse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Person {
    protected String name;
    public abstract void action(Mouse mouse);
    public abstract void action(Keyboard keyboard);
}
