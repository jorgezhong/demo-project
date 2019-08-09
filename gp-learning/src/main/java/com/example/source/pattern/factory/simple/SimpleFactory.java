package com.example.source.pattern.factory.simple;

import com.example.source.pattern.factory.Mengniu;
import com.example.source.pattern.factory.Milk;
import com.example.source.pattern.factory.Telunsu;
import com.example.source.pattern.factory.Yili;

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
