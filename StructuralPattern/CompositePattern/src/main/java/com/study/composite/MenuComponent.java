package com.study.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class MenuComponent {
    protected String name;
    protected int level;
    public abstract void print();
}
