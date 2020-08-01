package com.java.strategy;

/**
 * @ClassName: GoodFlyBehavior
 * @Author: kunyao
 * @Description: 策略模式 - 飞翔策略实现类
 * @Date: 2020/8/1 16:51
 * @Version: 1.0
 */
public class GoodFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("飞翔技术高超");
    }
}
