package com.example.observer.demo3.observer;

import com.example.observer.demo2.subject.Subject;
import com.example.observer.demo3.DisplayElement;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/18 9:32.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private Subject subject;

    @Override
    public void display() {
        // TODO: 2018/9/18 显示当前观测值
    }

    @Override
    public void udpate() {

    }
}
