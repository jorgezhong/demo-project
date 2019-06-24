package com.example.decorator.demo2.decorator;

import com.example.decorator.demo2.component.Beverage;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/18 16:06.
 *
 * 被Whip装饰
 */
public class Whip extends CondimentDecorator {


    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDiscription() {
        return beverage.getDiscription() + ", Whip";
    }

    @Override
    public double cost() {

        return 0.56 + beverage.cost();
    }
}
