package com.example.source.pattern.factory;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2019/8/9 15:55.
 */
public class SimpleFactory {

    public Milk getMilk(String name) {

        if (Milk.TELUNSU.equals(name)) {
            return new Telunsu();
        }
        else if(Milk.YILI.equals(name)) {
            return new Yili();
        }
        else if(Milk.MENGNIU.equals(name)) {
            return new Mengniu();
        }

        return null;
    }

}
