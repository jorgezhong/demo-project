package com.example.factory.demo2.pizza;

import com.example.factory.demo2.factory.PizzaIngredientFactory;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/21 11:24.
 */
public class VeggiePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("preparing " + name);
        //跟工厂要原材料
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
