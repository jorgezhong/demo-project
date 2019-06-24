package com.example.design.demo6.quack;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/12 13:24.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
