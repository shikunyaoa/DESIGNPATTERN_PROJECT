package com.java.factory.simpleFactory.pizza;

import javax.sql.rowset.BaseRowSet;
import java.awt.geom.GeneralPath;

/**
 * @ClassName: SimpleFactory
 * @Author: kunyao
 * @Description: 简单工厂 - 封装创建对象的过程
 * @Date: 2020/7/19 20:04
 * @Version: 1.0
 */
public class SimpleFactory {
    
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("Greek");
        }else if(type.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }else{

        }
        return pizza;
    }
}


