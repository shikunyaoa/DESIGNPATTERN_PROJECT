package com.java.strategy;

/**
 * @ClassName: NoFlyBehavior
 * @Author: kunyao
 * @Description:
 * @Date: 2020/8/1 16:53
 * @Version: 1.0
 */
public class NoFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
