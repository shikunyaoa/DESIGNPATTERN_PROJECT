package com.java.observer;

/**
 * @ClassName: CurrentConditions
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/27 10:35
 * @Version: 1.0
 */
public class CurrentConditions {

    private float temperature;
    private float pressure;
    private float humidity;

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
