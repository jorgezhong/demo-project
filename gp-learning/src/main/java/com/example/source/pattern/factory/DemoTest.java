package com.example.source.pattern.factory;

import com.example.source.pattern.factory.abstract_.MilkFactory;
import com.example.source.pattern.factory.function.MengniuFactory;
import com.example.source.pattern.factory.function.TelunsuFactory;
import com.example.source.pattern.factory.function.YiliFactory;
import com.example.source.pattern.factory.simple.SimpleFactory;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2019/8/9 15:40.
 */
public class DemoTest {

    private static final Logger logger = LoggerFactory.getLogger(DemoTest.class);

    /**
     * 简单工程演示
     * - 可理解为小作坊
     *
     * - 该作坊生产各种牛奶不专业
     *
     * - 相对于直接new而言，抽象了new的过程
     */
    @Test
    public void simple() {

        /**
         * 这个new对象的过程实际上是一个比较复杂的过程
         * 使用工厂来做这个复杂的过程,不需要自己new了
         */

        logger.info(new Telunsu().getName());

        /**
         * 小作坊的生产方式
         * 用户本身不再关心生产过程，而只需要关心结果
         * 工厂本身把创建对象的过程隐藏了，用户只需要问工厂要即可
         */
        SimpleFactory simpleFactory = new SimpleFactory();
        Milk telunsu = simpleFactory.getMilk(Milk.TELUNSU);
        Milk yili = simpleFactory.getMilk(Milk.YILI);
        Milk mengniu = simpleFactory.getMilk(Milk.MENGNIU);


        logger.info("牛奶：[{},{},{}]",telunsu.getName(),yili.getName(),mengniu.getName());


    }


    /**
     * 工厂方法演示
     * - 可理解为标准化批量生产的工厂，
     * - 各种牛奶的工厂，专门批量生产他们的专业产品
     * - 一个工厂生产一种牛奶
     *
     * - 对用户而言，货比三家，需要了解具体是哪个工厂
     *
     * - 相对于简单工厂而言，抽象了产品
     */
    @Test
    public void function() {

        MengniuFactory mengniuFactory = new MengniuFactory();
        YiliFactory yiliFactory = new YiliFactory();
        TelunsuFactory telunsuFactory = new TelunsuFactory();

        logger.info("牛奶：[{},{},{}]",mengniuFactory.getMilk(),yiliFactory.getMilk(),telunsuFactory.getMilk());
    }


    /**
     * 抽象工厂演示
     * - 相对于工厂方法而言，即抽象了工厂，也抽象了产品
     *
     * - 在spring中应用最广泛的设计模式
     */
    @Test
    public void abstract_() {

        MilkFactory milkFactory = new MilkFactory();
        logger.info("牛奶：[{},{},{}]",milkFactory.getMengniu(),milkFactory.getTelunsu(),milkFactory.getYili());

    }

}
