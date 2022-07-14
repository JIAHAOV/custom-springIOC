package com.study.code.whiteBox;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 备忘录
 */
@Data
@AllArgsConstructor
public class Memento {
    private int count;
    private String state;
}
