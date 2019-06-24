package com.example.observer.demo6.observer;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/18 9:14.
 *
 * 观察者接口：所有潜在的观察者必须实现观察者接口，该demo中只有update一个方法，当Subject状态改变时，它被调用
 */
public interface Observer {

    void udpate(float temp, float humidity, float pressure);

}
