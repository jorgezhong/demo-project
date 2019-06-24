package com.example.factory.demo1;

import com.example.factory.demo1.factory.ChicagoPizzaFactory;
import com.example.factory.demo1.factory.NYPizzaFactory;
import com.example.factory.demo1.store.ChicagoStylePizzaStore;
import com.example.factory.demo1.store.NYStylePizzaStore;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/20 16:19.
 */
public class PizzaStoreDrive {

    public static void main(String[] args) {


        NYStylePizzaStore nyStylePizzaStore = new NYStylePizzaStore(new NYPizzaFactory());
        nyStylePizzaStore.orderPizza("cheese");
        nyStylePizzaStore.orderPizza("clam");

        ChicagoStylePizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore(new ChicagoPizzaFactory());
        chicagoStylePizzaStore.orderPizza("cheese");
        chicagoStylePizzaStore.orderPizza("clam");


    }
}
