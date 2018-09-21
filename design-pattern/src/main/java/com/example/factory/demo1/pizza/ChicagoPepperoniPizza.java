package com.example.factory.demo1.pizza;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/20 8:59.
 */
public class ChicagoPepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("prepare Chicago style pepperoni");
    }

}
