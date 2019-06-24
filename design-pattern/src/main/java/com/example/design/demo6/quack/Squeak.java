package com.example.design.demo6.quack;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/12 13:25.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}
