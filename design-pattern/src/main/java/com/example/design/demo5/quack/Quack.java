package com.example.design.demo5.quack;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/12 13:24.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
