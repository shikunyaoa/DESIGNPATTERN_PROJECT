package com.java.observer.improve;

/**
 * 观察者模式 - 观察者行为接口
 */
public interface Observer {

    public void update(float temperatrue, float pressure, float humidity);
}
