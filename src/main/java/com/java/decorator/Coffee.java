package com.java.decorator;

/**
 * @ClassName: Coffee
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/23 20:34
 * @Version: 1.0
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }

}
