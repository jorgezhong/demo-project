package com.example.demo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/8/30 15:48.
 */
public class LockDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(LockDemo.class);

    /**
     * 两个线程争取同一把锁
     */
    @Test
    public void lockTest() throws InterruptedException {
        //造一把锁先
        ReentrantLock reentrantLock = new ReentrantLock();

        Thread thread0 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                lockTestHandle(reentrantLock);
            }
        });

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                lockTestHandle(reentrantLock);
            }
        });

        thread0.start();
        thread1.start();

        while (thread0.isAlive() || thread1.isAlive()) {}
    }

    private void lockTestHandle(ReentrantLock reentrantLock) {
        try {

            //  加锁
            reentrantLock.lock();
            LOGGER.info("拿到锁了,持有锁5s");
            Thread.sleep(5000);

        } catch (Exception e) {
            // TODO: 2018/8/30 do something
        } finally {
            // 记得自己释放锁，不然造成死锁了
            reentrantLock.unlock();
            LOGGER.info("释放锁了");

        }
    }


    /**
     * lockInterruptibly：加了可中断锁的线程，如果在获取不到锁，可被中断。
     * <p>
     * 中断其实是使用了异常机制，当调用中断方法，会抛出InterruptedException异常，捕获它可处理中断逻辑
     */
    @Test
    public void lockInterruptiblyTest() throws InterruptedException {

        ReentrantLock reentrantLock = new ReentrantLock();

        Thread thread0 = new Thread(() -> {

            try {
                lockInterruptiblyTestHandle(reentrantLock);
            } catch (InterruptedException e) {
                LOGGER.info("被中断了");
            }

        });

        Thread thread1 = new Thread(() -> {

            try {
                lockInterruptiblyTestHandle(reentrantLock);
            } catch (InterruptedException e) {
                LOGGER.info("被中断了");
            }

        });
        thread1.setPriority(10);

        thread1.start();
        thread0.start();

        Thread.sleep(500);
        thread0.interrupt();

        while (thread0.isAlive() || thread1.isAlive()) {}
    }

    private void lockInterruptiblyTestHandle(ReentrantLock reentrantLock) throws InterruptedException {
        /*
         * 加锁不能放在try...finally块里面，会出现IllegalMonitorStateException，意思是当lockInterruptibly()异常的时候，执行了unlock()方法
         * 其实就是加锁都抛出异常失败了，你还去解锁时不行的。放外面抛出异常的时候就不会去解锁了
         */
        reentrantLock.lockInterruptibly();
        try {
            LOGGER.info("拿到锁了,持有锁5秒");
            Thread.sleep(5000);
        } finally {
            // 释放锁
            reentrantLock.unlock();
            LOGGER.info("释放锁了");
        }
    }


    @Test
    public void readWriteLockTest(){

        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        try {
            readEvent();
        } catch (Exception e) {
            LOGGER.error(e.getMessage(),e);
        }finally {
            readLock.unlock();
        }

        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        try {
            writeEvent();
        } catch (Exception e) {
            LOGGER.error(e.getMessage(),e);
        }finally {
            writeLock.unlock();
        }


    }

    private void writeEvent() {
        // TODO: 2018/9/3 done write event
    }

    private void readEvent() {

        // TODO: 2018/9/3 done read event

    }


}
