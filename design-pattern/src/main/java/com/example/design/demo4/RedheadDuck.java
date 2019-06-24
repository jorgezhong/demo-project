package com.example.design.demo4;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/12 10:46.
 */
public class RedheadDuck extends Duck implements Flyable, Quackable {


    @Override
    public void display() {
        System.out.println("外观：红头");
    }


    @Override
    public void fly() {
        System.out.println("飞");
    }

    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
