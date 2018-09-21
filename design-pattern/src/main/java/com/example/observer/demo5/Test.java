package com.example.observer.demo5;

import com.example.observer.demo5.observer.CurrentConditionDisplay;
import com.example.observer.demo5.observer.ForecastDisplay;
import com.example.observer.demo5.observer.StatisticDisplay;
import com.example.observer.demo5.subject.WeatherData;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/18 10:01.
 */
public class Test {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();


        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);


        weatherData.setMeasurements(14,12,12);
        weatherData.setMeasurements(14,13,13);

    }

}
