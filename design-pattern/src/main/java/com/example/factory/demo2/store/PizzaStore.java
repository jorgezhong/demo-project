package com.example.factory.demo2.store;


import com.example.factory.demo2.pizza.Pizza;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/20 9:01.
 */
public abstract class PizzaStore {


    public Pizza orderPizza(String type) {

        //工厂生产需要的pizza
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * 抽象工厂方法
     *
     * @param type
     * @return
     */
    abstract Pizza createPizza(String type);
}
