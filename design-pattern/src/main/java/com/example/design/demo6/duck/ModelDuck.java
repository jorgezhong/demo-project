package com.example.design.demo6.duck;

import com.example.design.demo6.fly.FlyNoWay;
import com.example.design.demo6.quack.Quack;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/12 14:54.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("外观：模型鸭");
    }
}
