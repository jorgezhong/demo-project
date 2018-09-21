package com.example.observer.demo4.subject;

import com.example.observer.demo4.observer.Observer;

import java.util.ArrayList;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/14 16:48.
 *
 * demo1:违反了设计原则
 *  - 面向过程编程，直接将实现过程写入代码，导致每次修改要修改公共代码
 *  - 没有封装改变的部分。这里改变的部分就是布告板式改变的
 *
 */
public class WeatherData implements Subject{


    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.indexOf(observer) >= 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.udpate(temperature,humidity,pressure);
        }
    }

    /**
     * 新的测量数据备好后会被调用
     */
    public void measurementsChanged(){

        notifyObserver();

    }


    public void setMeasurements(float temperature,float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


}
