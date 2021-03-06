package com.java.mediator;

/**
 * @ClassName: Alarm
 * @Author: kunyao
 * @Description: 中介者模式 - 要交互的对象实现类
 * @Date: 2020/7/27 17:14
 * @Version: 1.0
 */
public class Alarm extends Colleague {

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    public void sendAlarm(int stateChange){
        SendMessage(stateChange);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }
}
