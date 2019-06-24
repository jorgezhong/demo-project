package com.example.observer.demo3.observer;

import com.example.observer.demo2.subject.Subject;
import com.example.observer.demo3.DisplayElement;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/18 9:33.
 */
public class StatisticsDisplay implements Observer,DisplayElement {

    private Subject subject;

    @Override
    public void display() {
        // TODO: 2018/9/18 统计数据 :最小、最大、平均值等
    }

    @Override
    public void udpate() {

    }
}
