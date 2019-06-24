package com.example.observer.demo4.subject;

import com.example.observer.demo4.observer.Observer;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/18 9:10.
 *
 * 主题接口：对象使用此接口注册为观察者。或者把自己是删除。
 */
public interface Subject {


    /**
     * 注册为观察者
     */
    void registerObserver(Observer observer);

    /**
     * 从观察者列表里删除（注销）
     */
    void removeObserver(Observer observer);

    /**
     * 通知当前所有观察者，主题状态改变
     */
    void notifyObserver();

}
