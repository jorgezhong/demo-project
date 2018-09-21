package com.example.factory.demo1.factory;

import com.example.factory.demo1.pizza.*;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/20 9:03.
 * 纽约工厂
 */
public class NYPizzaFactory extends SimplePizzaFactory{

    @Override
    public Pizza createPizza(String type) {

        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new NYStyleCheesePizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new NYPepperoniPizza();
        } else if ("clam".equals(type)) {
            pizza = new NYClamPizza();
        } else if ("veggie".equals(type)) {
            pizza = new NYVeggiePizza();
        }

        return pizza;

    }
}
