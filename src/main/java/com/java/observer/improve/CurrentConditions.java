package com.java.observer.improve;

/**
 * @ClassName: CurrentConditions
 * @Author: kunyao
 * @Description: 观察者模式 - 观察者行为实现类
 * @Date: 2020/7/27 11:08
 * @Version: 1.0
 */
public class CurrentConditions implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;


    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("***Today temperature***" + temperature);
        System.out.println("***Today pressure***" + pressure);
        System.out.println("***Today humidity***" + humidity);
    }
}
