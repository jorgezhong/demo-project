package com.example.decorator.demo0;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/18 16:03.
 *
 * 单品：Decaf
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
