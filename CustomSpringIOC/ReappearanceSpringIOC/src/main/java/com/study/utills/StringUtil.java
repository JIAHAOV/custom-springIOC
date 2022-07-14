package com.study.utills;

public class StringUtil {
    private StringUtil() {

    }

    public static String getMethodNameByField(String field) {
        String methodName = "set" + field.substring(0, 1).toUpperCase() + field.substring(1);
        return methodName;
    }
}
