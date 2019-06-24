package com.example.demo;

import org.junit.Test;

import java.util.function.Consumer;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/13 15:52.
 */
public class DemoTest {

    @Test
    public void test() {


        Consumer<String> strategy1 = o -> System.out.println("算法1:" + o);
        Consumer<String> strategy2 = o -> System.out.println("算法2:" + o);
        Consumer<String> strategy3 = o -> System.out.println("算法3:" + o);
        Consumer<String> strategy4 = o -> System.out.println("算法4:" + o);
        Consumer<String> strategy5 = o -> System.out.println("算法5:" + o);

        strategy1.accept("参数1");
        strategy2.accept("参数2");
        strategy3.accept("参数3");
        strategy4.accept("参数4");
        strategy5.accept("参数5");


        strategy(t -> System.out.println("算法" + t + "：参数" + t),"1");
        strategy(t -> System.out.println("算法" + t + "：参数" + t),"2");
        strategy(t -> System.out.println("算法" + t + "：参数" + t),"3");
        strategy(t -> System.out.println("算法" + t + "：参数" + t),"4");
        strategy(t -> System.out.println("算法" + t + "：参数" + t),"5");

    }

    /**
     * 策略
     * @param consumer
     * @param t
     * @param <T>
     */
    public <T> void strategy(Consumer<T> consumer,T t) {
        consumer.accept(t);
    }

}
