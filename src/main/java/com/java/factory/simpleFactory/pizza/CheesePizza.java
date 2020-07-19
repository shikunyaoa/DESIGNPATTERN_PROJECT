package com.java.factory.simpleFactory.pizza;

/**
 * @ClassName: CheesePizza
 * @Author: kunyao
 * @Description:  奶酪披萨实现类
 * @Date: 2020/7/19 19:33
 * @Version: 1.0
 */
public class CheesePizza extends Pizza{

    @Override
    public void prepare() {
        setName("奶酪");
        System.out.println("给奶酪披萨准备原材料");
    }


}
