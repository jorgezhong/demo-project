package com.example.factory.demo0;

import com.example.factory.demo0.factory.SimplePizzaFactory;
import com.example.factory.demo0.pizza.Pizza;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/20 9:01.
 */
public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {

        //工厂生产需要的pizza
        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
