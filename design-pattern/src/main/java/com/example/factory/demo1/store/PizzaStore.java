package com.example.factory.demo1.store;

import com.example.factory.demo1.factory.SimplePizzaFactory;
import com.example.factory.demo1.pizza.Pizza;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/20 9:01.
 */
public abstract class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }


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
