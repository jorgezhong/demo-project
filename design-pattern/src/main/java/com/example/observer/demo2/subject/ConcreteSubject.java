package com.example.observer.demo2.subject;

import com.example.observer.demo2.observer.Observer;

import java.util.ArrayList;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/18 9:16.
 */
public class ConcreteSubject implements Subject {


    ArrayList<Observer> observers = new ArrayList();


    @Override
    public void registerObserver() {

    }

    @Override
    public void removeObserver() {

    }

    @Override
    public void notifyObserver() {

    }
}
