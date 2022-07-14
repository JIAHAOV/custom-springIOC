package com.study.code;

import java.util.List;

/**
 * 抽象迭代器
 * @param <T>
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
    void setList(List<T> list);
}
