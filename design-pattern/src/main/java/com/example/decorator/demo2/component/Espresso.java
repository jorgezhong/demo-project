package com.example.decorator.demo2.component;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/18 16:03.
 */
public class Espresso extends Beverage {


    public Espresso() {
        discription = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
