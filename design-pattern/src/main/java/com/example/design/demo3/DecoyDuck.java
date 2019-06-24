package com.example.design.demo3;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/12 11:27.
 */
public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("外观：诱饵鸭");
    }

    @Override
    public void quack() {
        // 不会叫
    }

    @Override
    public void fly() {
        // 不会飞
    }
}
