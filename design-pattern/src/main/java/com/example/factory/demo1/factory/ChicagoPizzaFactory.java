package com.example.factory.demo1.factory;

import com.example.factory.demo1.pizza.*;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/20 9:03.
 * 芝加哥工厂
 */
public class ChicagoPizzaFactory extends SimplePizzaFactory{

    @Override
    public Pizza createPizza(String type) {

        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new ChicagoStyleCheesePizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new ChicagoPepperoniPizza();
        } else if ("clam".equals(type)) {
            pizza = new ChicagoClamPizza();
        } else if ("veggie".equals(type)) {
            pizza = new ChicagoVeggiePizza();
        }

        return pizza;

    }
}
