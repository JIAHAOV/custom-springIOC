package com.study.beans.config;

import lombok.AllArgsConstructor;
import lombok.Data;

//引用和属性值只能存在其中一个
@Data
@AllArgsConstructor
public class PropertyValue {
    //字段名称
    private String name;
    //属性值
    private String value;
    //引用
    private String ref;
}
