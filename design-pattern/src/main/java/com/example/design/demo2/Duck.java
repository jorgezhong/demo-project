package com.example.design.demo2;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/12 10:41.
 * <p>
 * demo1之后增加需求：让鸭子会飞
 */
public abstract class Duck {

    public void quack() {
        System.out.println("呱呱叫");
    }

    public void swim() {
        System.out.println("游泳");
    }

    /**
     * 考虑：每个鸭子外观不一样
     * 做法：抽象display方法
     */
    public abstract void display();


    public void fly() {
        System.out.println("飞");
    }
}
