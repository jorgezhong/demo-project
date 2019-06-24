package com.example.singleton.demo3;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/25 10:41.
 *
 * 双重检查
 */
public class Singleton {

    //volatile:确保可见性，保证每个线程拿到的值是最新的
    private volatile static Singleton uniqueSingleton;

    private Singleton() {
    }

    public static Singleton getInstance() {

        //第一次检查，进入锁代码
        if (uniqueSingleton == null) {
            synchronized (Singleton.class) {
                //第二次锁内检查，确保线程安全
                if (uniqueSingleton == null) {
                    uniqueSingleton = new Singleton();
                }
            }
        }

        return uniqueSingleton;

    }

}
