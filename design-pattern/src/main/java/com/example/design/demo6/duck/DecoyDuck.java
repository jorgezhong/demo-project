package com.example.design.demo6.duck;

import com.example.design.demo6.fly.FlyNoWay;
import com.example.design.demo6.quack.MuteQuack;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/12 11:27.
 */
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("外观：诱饵鸭");
    }

}
