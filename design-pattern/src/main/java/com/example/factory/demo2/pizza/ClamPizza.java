package com.example.factory.demo2.pizza;

import com.example.factory.demo2.factory.PizzaIngredientFactory;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/21 11:24.
 *
 * 具体产品(product)的子接口决定使用什么工厂，并且组合哪些原材料
 */
public class ClamPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
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
