package com.example.decorator.demo2.decorator;

import com.example.decorator.demo2.component.Beverage;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/18 16:06.
 *
 * 被Mocha装饰
 */
public class Mocha extends CondimentDecorator {


    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDiscription() {
        return beverage.getDiscription() + ", Mocha";
    }

    @Override
    public double cost() {

        return beverage.cost() + .20;
    }
}