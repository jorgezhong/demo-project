package com.example.factory.demo2;

import com.example.factory.demo2.pizza.Pizza;
import com.example.factory.demo2.store.NYStylePizzaStore;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/21 15:20.
 */
public class Test {

    public static void main(String[] args) {

        NYStylePizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        Pizza cheese = nyStylePizzaStore.orderPizza("cheese");

    }

}
