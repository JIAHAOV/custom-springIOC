package com.study.code;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<Variable, Double> map = new HashMap<>();
    public void addValue(Variable variable) {
        map.put(variable, variable.getValue());
    }
    public Double getValue(Variable variable) {
        return map.get(variable);
    }
}
