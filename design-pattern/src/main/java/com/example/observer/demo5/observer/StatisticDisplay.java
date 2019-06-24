package com.example.observer.demo5.observer;

import com.example.observer.demo5.DisplayElement;
import com.example.observer.demo5.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/18 9:32.
 */
public class StatisticDisplay implements Observer, DisplayElement {

    private Observable observable;

    private float temperature;
    private float humidity;
    private float pressure;

    public StatisticDisplay(Observable observable) {
        this.observable = observable;
        //注册
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistic:");
        System.out.println("temperature = " + temperature);
        System.out.println("humidity = " + humidity);
        System.out.println("pressure = " + pressure);

    }


    @Override
    public void update(Observable o, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
