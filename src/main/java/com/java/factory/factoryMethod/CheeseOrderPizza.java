package com.java.factory.factoryMethod;

/**
 * @ClassName: CheeseOrderPizza
 * @Author: kunyao
 * @Description: 抽象工厂实现类
 * @Date: 2020/7/19 21:09
 * @Version: 1.0
 */
public class CheeseOrderPizza extends OrderPizza {


    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if(orderType.equals("cheese")){
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
