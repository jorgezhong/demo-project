package com.example.factory.demo0.pizza;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/20 8:59.
 */
public class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("prepare pepperoni");
    }

}
