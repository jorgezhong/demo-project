package com.example.design.demo1;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/12 10:41.
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


}
