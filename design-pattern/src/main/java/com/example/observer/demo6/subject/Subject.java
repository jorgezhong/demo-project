package com.example.observer.demo6.subject;

import com.example.observer.demo6.observer.Observer;

import java.util.ArrayList;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/18 9:10.
 *
 * 主题接口：对象使用此接口注册为观察者。或者把自己是删除。
 */
public interface Subject {

    ArrayList<Observer> observers = new ArrayList<>();

    /**
     * 注册为观察者
     */
    default void registerObserver(Observer observer){
        observers.add(observer);
    }

    /**
     * 从观察者列表里删除（注销）
     */
    default void removeObserver(Observer observer){
        if (observers.indexOf(observer) >= 0) {
            observers.remove(observer);
        }
    }

    /**
     * 通知当前所有观察者，主题状态改变
     */
    void notifyObserver();

}
