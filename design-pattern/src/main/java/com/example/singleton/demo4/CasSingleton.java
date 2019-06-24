package com.example.singleton.demo4;

import java.util.concurrent.atomic.AtomicReference;

/**
 *
 * 自旋式单例
 * Project <demo-project>
 * Created by jorgezhong on 2019/6/24 15:23.
 */
public class CasSingleton {

    private static final AtomicReference<CasSingleton> INSTANCE = new AtomicReference<>();

    public static CasSingleton getInstance() {
        while (true) {
            CasSingleton singleton = INSTANCE.get();
            if (singleton != null) {
                return singleton;
            }

            singleton = new CasSingleton();
            INSTANCE.compareAndSet(null, singleton);
            return singleton;
        }
    }
}




