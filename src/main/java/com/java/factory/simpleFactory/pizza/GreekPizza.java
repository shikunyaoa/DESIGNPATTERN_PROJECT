package com.java.factory.simpleFactory.pizza;

/**
 * @ClassName: GreekPizza
 * @Author: kunyao
 * @Description: 希腊披萨
 * @Date: 2020/7/19 19:35
 * @Version: 1.0
 */
public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        setName("GreekPizza");
        System.out.println("给希腊披萨准备原材料");
    }
}
