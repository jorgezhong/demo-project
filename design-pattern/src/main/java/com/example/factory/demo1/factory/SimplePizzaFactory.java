package com.example.factory.demo1.factory;

import com.example.factory.demo1.pizza.*;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/20 9:03.
 * 定义工厂
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {

        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza();
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza();
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza();
        }

        return pizza;

    }
}
