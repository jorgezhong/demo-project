package com.example.singleton.demo4;

/**
 * 通过私有静态内部类持有当前对象来实现单例
 * Project <demo-project>
 * Created by jorgezhong on 2019/6/24 15:36.
 */
public class LazyLoadSingleton {

    private LazyLoadSingleton() {
    }

    private static class SingletonHolder {
        private static final LazyLoadSingleton instance = new LazyLoadSingleton();
    }

    public static final LazyLoadSingleton getInstance() {
        return SingletonHolder.instance;
    }

}
