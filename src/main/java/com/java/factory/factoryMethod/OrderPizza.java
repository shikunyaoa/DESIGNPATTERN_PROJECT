package com.java.factory.factoryMethod;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @ClassName: OrderPizza
 * @Author: kunyao
 * @Description: pizza抽象工厂
 * @Date: 2020/7/19 21:03
 * @Version: 1.0
 */
public abstract class OrderPizza {

    abstract Pizza createPizza(String orderType);

    public OrderPizza(){
        Pizza pizza = null;
        String orderType;

        do{
            orderType = getType();
            pizza = createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while(true);
    }

    public String getType(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            bufferedReader.read();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }
}
