package com.java.factory.absFactory;

/**
 * @ClassName: OrderPizza
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/19 22:24
 * @Version: 1.0
 */
public class OrderPizza {

    AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory){
        setFactory(absFactory);
    }

    private void setFactory(AbsFactory factory){
        Pizza pizza = null;
        String orderType = "";
        this.absFactory = factory;

        do{
            pizza = factory.createPizza(orderType);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                break;
            }
        }while(true);
    }
}
