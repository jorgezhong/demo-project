package com.example.factory.demo2.store;

import com.example.factory.demo2.factory.NYPizzaIngredientFactory;
import com.example.factory.demo2.pizza.*;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/20 10:23.
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {

        Pizza pizza = null;

        NYPizzaIngredientFactory factory = new NYPizzaIngredientFactory();

        if ("cheese".equals(type)) {
            pizza = new CheesePizza(factory);
            pizza.setName("New York Style Cheese Pizza");

        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza(factory);
            pizza.setName("New York Style Pepperoni Pizza");

        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(factory);
            pizza.setName("New York Style clam Pizza");

        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza(factory);
            pizza.setName("New York Style veggie Pizza");
        }
        return pizza;

    }
}
