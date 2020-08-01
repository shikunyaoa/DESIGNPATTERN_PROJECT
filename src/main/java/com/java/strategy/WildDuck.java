package com.java.strategy;

/**
 * @ClassName: WildDuck
 * @Author: kunyao
 * @Description:
 * @Date: 2020/8/1 16:56
 * @Version: 1.0
 */
public class WildDuck extends Duck {


    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是野鸭");
    }
}
