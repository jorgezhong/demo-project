package com.example.factory.demo1.store;

import com.example.factory.demo1.factory.SimplePizzaFactory;
import com.example.factory.demo1.pizza.Pizza;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/20 10:23.
 */
public class NYStylePizzaStore extends PizzaStore {
    public NYStylePizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }

    @Override
    Pizza createPizza(String type) {
        return factory.createPizza(type);
    }
}
