package com.java.observer;

/**
 * @ClassName: WeatherData
 * @Author: kunyao
 * @Description:
 * @Date: 2020/7/27 10:38
 * @Version: 1.0
 */
public class WeatherData {

    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
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
        currentConditions.update(getTemperature(), getPressure(), getHumidity());
    }

    public void setData(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }
}
