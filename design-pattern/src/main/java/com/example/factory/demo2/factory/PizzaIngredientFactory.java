package com.example.factory.demo2.factory;

import com.example.factory.demo2.material.*;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/21 10:01.
 *
 * 顶层原材料工厂：
 *     这里定义接口其实是使用了组合的思想，使用方法来组合实例化的原材料对象，其子类实现这些方法，实例化当地的具体产品需要的的原材料
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClams();
}
