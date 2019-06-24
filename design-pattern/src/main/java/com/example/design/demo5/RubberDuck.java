package com.example.design.demo5;

import com.example.design.demo5.fly.FlyNoWay;
import com.example.design.demo5.quack.Squeak;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/12 11:20.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("外观：橡皮鸭");
    }


}
