package com.example.design.demo5;

import com.example.design.demo5.fly.FlyBehavior;
import com.example.design.demo5.quack.QuackBehavior;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/12 10:41.
 * <p>
 * demo4问题解决：
 * - 封装变化的部分，把改变和固定分开：封装鸭子的行为，此类提供某行为接口的实现
 * - 面向接口编程，而不是面向实现编程：定义鸭子行为的一系列接口，封装鸭子行未的类去实现某些定义了行未的接口，
 * 鸭子类组合行为接口。具体类实例化具体接口
 */
public abstract class Duck {


    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("游泳");
    }

    /**
     * 考虑：每个鸭子外观不一样
     * 做法：抽象display方法
     */
    public abstract void display();


    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

}
