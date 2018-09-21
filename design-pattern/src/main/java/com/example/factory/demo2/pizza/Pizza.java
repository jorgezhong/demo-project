package com.example.factory.demo2.pizza;

import com.example.factory.demo2.material.*;

import java.util.Arrays;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/21 10:31.
 *
 * 顶层产品抽象类：pizza，依赖一系列原材料种类
 */
public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    public abstract void prepare();

    public void bake(){
        System.out.println("bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public Pizza setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pizza{");
        sb.append("name='").append(name).append('\'');
        sb.append(", dough=").append(dough);
        sb.append(", sauce=").append(sauce);
        sb.append(", veggies=").append(Arrays.toString(veggies));
        sb.append(", cheese=").append(cheese);
        sb.append(", pepperoni=").append(pepperoni);
        sb.append(", clams=").append(clams);
        sb.append('}');
        return sb.toString();
    }
}
