package com.java.factory.absFactory;

/**
 * @ClassName: LDFactory
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/19 22:22
 * @Version: 1.0
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("Greek")){
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
