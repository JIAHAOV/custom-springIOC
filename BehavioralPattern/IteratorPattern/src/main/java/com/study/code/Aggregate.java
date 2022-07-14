package com.study.code;

/**
 * 抽象聚合，存储对象集合
 * @param <T>
 */
public interface Aggregate<T> {
    void addPerson(T obj);
    void removePerson(T obj);
    Iterator<T> getPersonIterator();
}
