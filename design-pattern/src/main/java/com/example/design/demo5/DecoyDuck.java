package com.example.design.demo5;

import com.example.design.demo5.fly.FlyNoWay;
import com.example.design.demo5.quack.MuteQuack;

/**
 * Project <demo-project>
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
