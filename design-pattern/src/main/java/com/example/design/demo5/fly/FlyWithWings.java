package com.example.design.demo5.fly;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/12 13:22.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞");
    }
}