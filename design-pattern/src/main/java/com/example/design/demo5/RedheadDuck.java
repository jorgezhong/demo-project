package com.example.design.demo5;

import com.example.design.demo5.fly.FlyWithWings;
import com.example.design.demo5.quack.Quack;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/12 10:46.
 */
public class RedheadDuck extends Duck {


    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("外观：红头");
    }


}
