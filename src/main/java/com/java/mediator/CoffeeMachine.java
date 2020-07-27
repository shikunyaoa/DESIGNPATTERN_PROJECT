package com.java.mediator;

/**
 * @ClassName: CoffeeMachine
 * @Author: kunyao
 * @Description:
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
