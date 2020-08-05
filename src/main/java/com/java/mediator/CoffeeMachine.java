package com.java.mediator;

/**
 * @ClassName: CoffeeMachine
 * @Author: kunyao
 * @Description: 中介者模式 - 要交互的对象实现类
 * @Date: 2020/7/27 17:32
 * @Version: 1.0
 */
public class CoffeeMachine extends Colleague {

    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);

        mediator.register(name, this);
    }

    public void startCoffee(){

    }

    @Override
    public void SendMessage(int stateChange) {

    }
}
