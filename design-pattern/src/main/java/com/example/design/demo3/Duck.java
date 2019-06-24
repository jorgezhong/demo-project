package com.example.design.demo3;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/12 10:41.
 * <p>
 * demo2之后扩展需求：
 * - 增加一个橡皮鸭子RubberDuck
 * - 橡皮鸭的叫发改变为：吱吱叫，不会飞
 * - 增加一个诱饵鸭DecoyDuck
 * - 诱饵鸭不会叫，不会飞
 * <p>
 * demo3暴露的问题：
 * - 橡皮鸭没有生命，本应该不会飞，但是由于父类实现了fly而变得会飞了。这不符合需求
 * 解决：橡皮鸭会飞的问题可以覆盖fly方法，变成空实现。
 * - 扩展带来了问题：，以后如果拓展其他鸭子，而这些鸭子不需要父类一些方法，我们都要覆盖父类方法并提供空实现。这样不好
 * 解决：尝试使用接口
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
