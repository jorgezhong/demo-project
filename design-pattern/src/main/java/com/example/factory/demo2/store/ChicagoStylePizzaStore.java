package com.example.factory.demo2.store;

import com.example.factory.demo2.factory.ChicagoPizzaIngredientFactory;
import com.example.factory.demo2.pizza.*;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/20 10:23.
 */
public class ChicagoStylePizzaStore extends PizzaStore {


    @Override
    Pizza createPizza(String type) {

        Pizza pizza = null;

        ChicagoPizzaIngredientFactory factory = new ChicagoPizzaIngredientFactory();

        if ("cheese".equals(type)) {
            pizza = new CheesePizza(factory);
            pizza.setName("Chicago Style Cheese Pizza");

        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza(factory);
            pizza.setName("Chicago Style Pepperoni Pizza");

        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(factory);
            pizza.setName("Chicago Style clam Pizza");

        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza(factory);
            pizza.setName("Chicago Style veggie Pizza");
        }
        return pizza;

    }
}
