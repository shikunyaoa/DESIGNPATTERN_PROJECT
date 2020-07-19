package com.java.factory.absFactory;



/**
 * @ClassName: BjFactory
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/19 22:20
 * @Version: 1.0
 */
public class BjFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
