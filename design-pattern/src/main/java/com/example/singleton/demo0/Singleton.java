package com.example.singleton.demo0;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/25 9:42.
 * <p>
 * 经典单例模式
 * - 利用静态成员变量记录单例对象
 * - 私有构造方法
 * - 提供静态方法获取成员变量：延迟实例化
 *
 * 问题：线程安全问题
 */
public class Singleton {


    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {

        //延迟实例化
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }


}
