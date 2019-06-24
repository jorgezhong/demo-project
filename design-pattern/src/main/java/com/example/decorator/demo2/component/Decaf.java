package com.example.decorator.demo2.component;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/18 16:03.
 */
public class Decaf extends Beverage {

    public Decaf() {
        discription = "Decaf";
    }

    @Override
    public double cost() {
        return 2.33;
    }
}
