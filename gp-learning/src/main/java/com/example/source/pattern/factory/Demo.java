package com.example.source.pattern.factory;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2019/8/9 15:40.
 */
public class Demo {

    private static final Logger logger = LoggerFactory.getLogger(Demo.class);

    /**
     * 简单工程演示
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

}
