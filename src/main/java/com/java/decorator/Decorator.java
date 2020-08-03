package com.java.decorator;

/**
 * @ClassName: Decorator
 * @Author: kunyao
 * @Description: 装饰器模式 - 装饰器类
 * @Date: 2020/7/23 20:38
 * @Version: 1.0
 */
public class Decorator extends Drink {

    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }


    @Override
    public String getDes() {
        return super.des + " " + super.getPrice() + "&&"+ obj.getDes();
    }
}
