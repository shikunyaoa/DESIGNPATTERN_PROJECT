package com.java.mediator;

/**
 * @ClassName: Mediator
 * @Author: kunyao
 * @Description: 中介者模式 - 中介者抽象类
 * @Date: 2020/7/27 17:23
 * @Version: 1.0
 */
public abstract class Mediator {

    public abstract void register(String colleagueName, Colleague colleague);

    public abstract void getMessage(int stateChange, String colleagueName);

    public abstract void SendMessage();
}
