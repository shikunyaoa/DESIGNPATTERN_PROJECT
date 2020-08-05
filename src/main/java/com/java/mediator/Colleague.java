package com.java.mediator;

/**
 * @ClassName: Colleague
 * @Author: kunyao
 * @Description: 中介者模式 - 要交互的对象抽象类
 * @Date: 2020/7/27 17:13
 * @Version: 1.0
 */
public abstract class Colleague {

    private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator(){
        return this.mediator;
    }

    public abstract void SendMessage(int stateChange);

}
