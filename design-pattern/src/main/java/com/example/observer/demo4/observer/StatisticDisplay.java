package com.example.observer.demo4.observer;

import com.example.observer.demo4.DisplayElement;
import com.example.observer.demo4.subject.Subject;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/18 9:32.
 */
public class StatisticDisplay implements Observer, DisplayElement {

    private Subject weatherData;

    private float temperature;
    private float humidity;
    private float pressure;

    public StatisticDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        //注册
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistic:");
        System.out.println("temperature = " + temperature);
        System.out.println("humidity = " + humidity);
        System.out.println("pressure = " + pressure);

    }

    @Override
    public void udpate(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
