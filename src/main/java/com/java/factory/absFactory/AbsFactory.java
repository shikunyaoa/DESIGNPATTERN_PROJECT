package com.java.factory.absFactory;

/**
 * 抽象工厂模式的抽象层
 */
public interface AbsFactory {

    public Pizza createPizza(String orderType);
}
