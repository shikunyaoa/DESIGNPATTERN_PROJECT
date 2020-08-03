package com.java.decorator;

/**
 * @ClassName: Drink
 * @Author: kunyao
 * @Description: 装饰器模式 - 抽象类
 * @Date: 2020/7/23 20:32
 * @Version: 1.0
 */
public abstract class Drink {

    public String des; //描述
    private float price = 0.0f;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    //计算费用的抽象方法
    public abstract float cost();
}
