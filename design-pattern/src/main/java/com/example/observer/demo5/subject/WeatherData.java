package com.example.observer.demo5.subject;

import java.util.Observable;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/14 16:48.
 * <p>
 * demo1:违反了设计原则
 * - 面向过程编程，直接将实现过程写入代码，导致每次修改要修改公共代码
 * - 没有封装改变的部分。这里改变的部分就是布告板式改变的
 */
public class WeatherData extends Observable {


    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData() {
    }


    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


    /**
     * 新的测量数据备好后会被调用
     */
    public void measurementsChanged() {
        setChanged();
        notifyObservers();

    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }
}
