package com.java.strategy;

/**
 * @ClassName: BadFlyBehavior
 * @Author: kunyao
 * @Description:
 * @Date: 2020/8/1 16:52
 * @Version: 1.0
 */
public class BadFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("飞翔技术一般");
    }
}
