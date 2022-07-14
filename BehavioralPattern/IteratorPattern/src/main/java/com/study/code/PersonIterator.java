package com.study.code;

import java.util.List;
import java.util.Vector;

public class PersonIterator implements Iterator<Person>{
    private List<Person> list = new Vector<>();
    //标记现在的位置，用来查询是否还有下一个
    private int index = 0;
    //是否有下一个
    @Override
    public boolean hasNext() {
        return index < list.size();
    }
    //获取当前对象
    @Override
    public Person next() {
        Person person = list.get(index++);
        return person;
    }
    //设置遍历的集合
    @Override
    public void setList(List<Person> list) {
        this.list = list;
    }
}
