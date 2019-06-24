package com.example.factory.demo2.factory;

import com.example.factory.demo2.material.*;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/21 10:10.
 *
 * 具体工厂组合具体对象，返回对象的父类
 * 为什么返回父类？
 *   依赖抽象，便于管理。产品（Product）也就是pizza是不知道具体的原材料，只知道原材料种类
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarelle();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Blackolives(), new Spinach(), new Eggplant()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
