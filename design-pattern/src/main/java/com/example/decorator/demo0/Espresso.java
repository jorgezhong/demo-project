package com.example.decorator.demo0;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/18 16:03.
 *
 * 单品：Espresso
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
