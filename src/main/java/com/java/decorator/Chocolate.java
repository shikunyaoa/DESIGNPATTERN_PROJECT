package com.java.decorator;

/**
 * @ClassName: Chocolate
 * @Author: kunyao
 * @Description: 具体的Decorator
 * @Date: 2020/7/23 20:43
 * @Version: 1.0
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力");
        setPrice(3.0f);
    }


}
