package com.example.decorator.demo2.decorator;

import com.example.decorator.demo2.component.Beverage;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/18 16:04.
 * <p>
 * 调料装饰者
 */
public abstract class CondimentDecorator extends Beverage {


    Beverage beverage;

    @Override
    public abstract String getDiscription();
}
