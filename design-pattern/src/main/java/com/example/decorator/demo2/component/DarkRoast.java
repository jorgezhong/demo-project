package com.example.decorator.demo2.component;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/18 16:03.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        discription = "DarkRoast";
    }

    @Override
    public double cost() {

        return .99;
    }
}
