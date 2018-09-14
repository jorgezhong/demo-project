package com.example.observer.demo1;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/14 16:48.
 *
 * demo1:违反了设计原则
 *  - 面向过程编程，直接将实现过程写入代码，导致每次修改要修改公共代码
 *  - 没有封装改变的部分。这里改变的部分就是布告板式改变的
 *
 */
public class WeatherData {


    public String getTemperature(){

        return "温度";
    }

    public String getHumidity(){
        return "湿度";
    }

    public String getPressure(){
        return "气压";
    }

    /**
     * 新的测量数据备好后会被调用
     */
    public void measurementssChanged(){


        String temperature = getTemperature();
        String humidity = getHumidity();
        String pressure = getPressure();

        //目前
        currentConditionsDisplay.update(temperature,humidity,pressure);
        //统计
        statisticsDisplay.update(temperature, humidity, pressure);
        //预报
        forecastDisplay.update(temperature, humidity, pressure);


    }

}
