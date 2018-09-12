package com.example.design.demo4;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/12 10:41.
 * <p>
 * demo3问题解决：
 * - 抽取fly()到Flyable接口中
 * - 抽取quack()到接口Quackable接口中
 * - 需要的鸭子去实现对应的接口
 * <p>
 * 思考：接口使得方法不会混乱，不会出现在不该出现的地方
 * <p>
 * demo4暴露的问题：
 * - 重复代码：发现fly()的实现和quack()的实现是重复代码，如果要拓展很多个鸭子，那么都会又这些重复的代码
 * 解决：OO设计原则：
 * - 封装变化的部分，把改变和固定分开
 * - 面向接口编程，而不是面向实现编程
 */
public abstract class Duck {


    public void swim() {
        System.out.println("游泳");
    }

    /**
     * 考虑：每个鸭子外观不一样
     * 做法：抽象display方法
     */
    public abstract void display();


}
