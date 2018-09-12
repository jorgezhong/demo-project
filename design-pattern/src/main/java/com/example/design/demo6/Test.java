package com.example.design.demo6;

import com.example.design.demo6.duck.Duck;
import com.example.design.demo6.duck.MallardDuck;
import com.example.design.demo6.duck.ModelDuck;
import com.example.design.demo6.fly.FlyRocketPowered;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/12 14:57.
 */
public class Test {


    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();

        modelDuck.setFlyBehavior(new FlyRocketPowered());

        modelDuck.performFly();
    }

}
