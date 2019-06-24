package com.example.design.demo6.duck;

import com.example.design.demo6.fly.FlyBehavior;
import com.example.design.demo6.quack.QuackBehavior;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/12 10:41.
 * <p>
 * demo5之后拓展：
 * - 鸭子的行为可以是动态的
 * 鸭子具体的行未是具体行为类实例决定的，只要提供可以动态修改具体行为类的方法即可
 * - 创造一个新形的鸭子：模型鸭
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

    /**
     * 修改行为：FlyBehavior
     *
     * @param flyBehavior
     * @return
     */
    public Duck setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
        return this;
    }

    /**
     * 修改行为：QuackBehavior
     *
     * @param quackBehavior
     * @return
     */
    public Duck setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
        return this;
    }
}
