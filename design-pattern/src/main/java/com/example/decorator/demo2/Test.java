package com.example.decorator.demo2;

import com.example.decorator.demo2.component.Beverage;
import com.example.decorator.demo2.component.DarkRoast;
import com.example.decorator.demo2.component.Espresso;
import com.example.decorator.demo2.component.HouseBlend;
import com.example.decorator.demo2.decorator.Mocha;
import com.example.decorator.demo2.decorator.Soy;
import com.example.decorator.demo2.decorator.Whip;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/18 16:31.
 */
public class Test {


    public static void main(String[] args) {

        //点一杯Espresso
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDiscription());
        System.out.println(espresso.cost());

        //点一杯DarkRoast,加两份Mocha，加一份Whip
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDiscription());
        System.out.println(darkRoast.cost());

        //来一杯调料为：豆浆，摩卡，奶泡的HouseBlend咖啡
        Beverage houseBlend = new HouseBlend();
        houseBlend =  new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDiscription());
        System.out.println(houseBlend.cost());

    }

}
