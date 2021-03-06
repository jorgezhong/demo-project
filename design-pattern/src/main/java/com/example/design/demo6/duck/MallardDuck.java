package com.example.design.demo6.duck;

import com.example.design.demo6.fly.FlyWithWings;
import com.example.design.demo6.quack.Quack;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/12 10:45.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("外观：绿头");
    }


}
