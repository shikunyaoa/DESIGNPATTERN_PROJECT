package com.java.observer.improve;

/**
 * 观察者模式 - 注册中心抽象类
 */
public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
