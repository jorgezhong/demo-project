package com.example.design.demo3;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/12 11:20.
 */
public class RubberDuck extends Duck {


    /**
     * 覆盖父类方法，实现新的功能
     */
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }

    @Override
    public void display() {
        System.out.println("外观：橡皮鸭");
    }

    @Override
    public void fly() {
        //不会飞
    }
}
