package com.java.observer.improve;

import com.java.observer.CurrentConditions;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: WeatherData
 * @Author: kunyao
 * @Description: 观察者模式 - 注册中心实现类
 * @Date: 2020/7/27 10:38
 * @Version: 1.0
 */
public class WeatherData implements Subject {

    private float temperature;
    private float pressure;
    private float humidity;
    private List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange(){
        notifyObservers();
    }

    public void setData(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(getTemperature(), getPressure(), getHumidity());
        }
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
}
