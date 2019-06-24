package com.example.demo;

import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/8/31 16:01.
 */
public class ThreadDemo {

    @Test
    public void extendThreadTest() {
        ExtendThread extendThread = new ExtendThread();
        extendThread.start();
    }

    
    class ExtendThread extends Thread {

        @Override
        public void run() {
            // TODO: 2018/8/31
        }
    }


    @Test
    public void runnableThreadTest(){

        RunnableThread runnableThread = new RunnableThread();
        Thread thread = new Thread(runnableThread);
        thread.start();

    }

    class RunnableThread implements Runnable{

        @Override
        public void run() {
            // TODO: 2018/8/31
        }
    }


    @Test
    public void callableThreadTest(){

        CallableThread callableThread = new CallableThread();
        FutureTask<String> stringFutureTask = new FutureTask<>(callableThread);
        Thread thread = new Thread(stringFutureTask);
        thread.start();


    }

    /**
     * 这种实现是由返回值的
     */
    class  CallableThread implements Callable<String>{

        @Override
        public String call() {
            // TODO: 2018/8/31
            System.out.println("test");
            return "";
        }
    }


    
}
