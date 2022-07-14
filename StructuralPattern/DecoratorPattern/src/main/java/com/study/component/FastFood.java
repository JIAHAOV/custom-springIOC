package com.study.component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class FastFood {
    private double price;
    private String description;
    public abstract void total();
}
