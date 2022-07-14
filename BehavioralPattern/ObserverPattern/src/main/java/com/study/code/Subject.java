package com.study.code;

/**
 * 抽象主题（抽象被观察者）
 */
public interface Subject {
    /**
     * 添加观察者
     * @param observer 添加的观察者
     */
    void addObserver(Observer observer);
    /**
     * 移除观察者
     * @param observer 被移除的观察者
     */
    void removeObserver(Observer observer);
    /**
     * 发生变化时通知所以的观察者
     * @param message 更新的信息
     */
    void notifyAll(String message);
}
