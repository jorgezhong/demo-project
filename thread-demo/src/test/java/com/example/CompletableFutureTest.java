package com.example;

import org.junit.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/8 11:45.
 */
public class CompletableFutureTest {


    /**
     * 创建CompletableFuture
     * - runAsync
     * - supplyAsync
     * - completedFuture
     *
     * 异步计算启用的线程池是守护线程
     */
    @Test
    public void test1() {

        //1、异步计算：无返回值

        //默认线程池为：ForkJoinPool.commonPool()
        CompletableFuture.runAsync(() -> {
            // TODO: 2018/9/8 无返回异步计算
            System.out.println(Thread.currentThread().isDaemon());
        });

        //指定线程池
        CompletableFuture.runAsync(() -> {
            // TODO: 2018/9/8 无返回异步计算
        }, Executors.newFixedThreadPool(2));


        //2、异步计算：有返回值

        // 使用默认线程池
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "result1");
        //getNow指定异步计算抛出异常或结果返回null时替代的的值
        String result1 = future1.getNow(null);


        //  指定线程池
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "result2", Executors.newFixedThreadPool(2));
        //getNow指定异步计算抛出异常或结果返回null时替代的的值
        String result2 = future2.getNow(null);


        //3、初始化一个有结果无计算的CompletableFuture
        CompletableFuture<String> future = CompletableFuture.completedFuture("result");
        String now = future.getNow(null);
        System.out.println("now = " + now);


    }


    /**
     * 计算完成时需要对异常进行处理或者对结果进行处理
     * - whenComplete：同步处理包括异常
     * - thenApply：同步处理正常结果（前提是没有异常）
     *
     * - whenCompleteAsync：异步处理包括异常
     * - thenApplyAsync：异步处理正常结果(前提是没有异常)
     *
     * - exceptionally : 处理异常
     */
    @Test
    public void test2() {


        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "result");

        //whenComplete方法收future的结果和异常，可灵活进行处理
        //1、同步处理

        //  无返回值：可处理异常
        future.whenComplete((result, throwable) -> System.out.println("result = " + result));

        //  有返回值：没有异常处理（前提）
        CompletableFuture<String> resultFuture1 = future.thenApply(result -> "result");
        String result1 = resultFuture1.getNow(null);



        //2、异步处理：

        //  无返回值： 默认线程池
        future.whenCompleteAsync((result, throwable) -> System.out.println("result = " + result));
        //  无返回值：指定线程池
        future.whenCompleteAsync((result, throwable) -> System.out.println("result = " + result), Executors.newFixedThreadPool(2));

        //  有返回值：默认线程池
        CompletableFuture<String> resultFuture2 = future.thenApplyAsync(result -> "result");
        String result2 = resultFuture2.getNow(null);

        //  有返回值：指定线程池
        CompletableFuture<String> resultFuture3 = future.thenApplyAsync(result -> "result",Executors.newFixedThreadPool(2));
        String result3 = resultFuture3.getNow(null);



        //3、处理异常,处理完之后返回一个结果
        CompletableFuture<String> exceptionallyFuture = future.whenCompleteAsync((result, throwable) -> System.out.println("result = " + 1/0))
                .exceptionally(throwable -> "发生异常了：" + throwable.getMessage());
        System.out.println(exceptionallyFuture.getNow(null));



    }


    /**
     *
     */
    @Test
    public void test3() {


    }


    @Test
    public void test0() {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "result" + 1 / 0);
        //3、处理异常
        CompletableFuture<String> future1 = future.exceptionally(throwable -> "发生异常了：" + throwable.getMessage())
                .whenCompleteAsync((result, throwable) -> System.out.println("result = " + result));

    }


}
