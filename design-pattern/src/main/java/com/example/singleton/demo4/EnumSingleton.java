package com.example.singleton.demo4;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2019/6/24 15:39.
 */
public class EnumSingleton {

    private EnumSingleton() {
    }

    public static EnumSingleton getInstance() {
        return Singleton.INSTANCE.getInstance();
    }


    enum Singleton{

        INSTANCE;

        private EnumSingleton enumSingleton;

        /**
         * jvm保证该方法只会被调用一次
         */
        private Singleton() {
            this.enumSingleton = new EnumSingleton();
        }

        public EnumSingleton getInstance() {
            return enumSingleton;
        }
    }

}
