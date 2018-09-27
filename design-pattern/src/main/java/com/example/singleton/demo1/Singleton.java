package com.example.singleton.demo1;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/25 10:28.
 * <p>
 * 静态初始化的时候：初始化单例对象，解决线程安全问题
 */
public class Singleton {

    private static Singleton uniqueSingleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstacne() {

        return uniqueSingleton;
    }

}
