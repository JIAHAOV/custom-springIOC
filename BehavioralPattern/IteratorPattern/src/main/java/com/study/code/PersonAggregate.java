package com.study.code;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合类
 */
public class PersonAggregate implements Aggregate<Person>{
    private final List<Person> list = new ArrayList<>();
    //添加对象
    @Override
    public void addPerson(Person obj) {
        list.add(obj);
    }
    //移除对象
    @Override
    public void removePerson(Person obj) {
        list.remove(obj);
    }
    //获取迭代器
    @Override
    public Iterator<Person> getPersonIterator() {
        PersonIterator iterator = new PersonIterator();
        iterator.setList(this.list);
        return iterator;
    }
}
