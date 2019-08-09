package com.example.source.pattern.factory.function;

import com.example.source.pattern.factory.Milk;
import com.example.source.pattern.factory.Telunsu;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2019/8/9 17:14.
 */
public class TelunsuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}
