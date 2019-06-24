package com.example.decorator.demo2.decorator;

import com.example.decorator.demo2.component.Beverage;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/18 16:06.
 *
 * 被Soy装饰
 */
public class Soy extends CondimentDecorator {


    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDiscription() {
        return beverage.getDiscription() + ", Soy";
    }

    @Override
    public double cost() {

        return beverage.cost() + 0.44;
    }
}
