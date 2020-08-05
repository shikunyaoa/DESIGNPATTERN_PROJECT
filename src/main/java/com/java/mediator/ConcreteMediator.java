package com.java.mediator;

import java.util.HashMap;

/**
 * @ClassName: ConcreteMediator
 * @Author: kunyao
 * @Description: 中介者模式 - 中介者实现类
 * @Date: 2020/7/27 17:25
 * @Version: 1.0
 */
public class ConcreteMediator extends Mediator {

    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        this.colleagueMap = new HashMap<>();
        this.interMap = new HashMap<>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);
        if(colleague instanceof Alarm){
            interMap.put("Alarm", colleagueName);
        }
    }

    /**
     * 具体中介者的核心方法
     * 1. 根据得到消息，完成对应任务
     * 2. 中介者在这个方法，协调各个具体的同事对象，完成任务
     * @param stateChange
     * @param colleagueName
     */
    @Override
    public void getMessage(int stateChange, String colleagueName) {
        if(colleagueMap.get(colleagueName) instanceof Alarm){
            if(stateChange == 0){
                ((CoffeeMachine)(colleagueMap.get(interMap.get("CoffeeMachine")))).startCoffee();
            }
        }
    }

    @Override
    public void SendMessage() {

    }
}
