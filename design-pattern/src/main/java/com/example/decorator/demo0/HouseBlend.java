package com.example.decorator.demo0;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/18 16:03.
 *
 * 单品：HouseBlend
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        discription = "HouseBlend";
    }

    @Override
    public double cost() {

        return .89;
    }
}
