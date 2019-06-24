package com.example.factory.demo1.pizza;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/20 8:59.
 */
public class ChicagoVeggiePizza extends Pizza {
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("prepare Chicago style vegetable");
    }

}
