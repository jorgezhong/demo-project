package com.example.source.pattern.factory.function;

import com.example.source.pattern.factory.Mengniu;
import com.example.source.pattern.factory.Milk;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2019/8/9 17:14.
 */
public class MengniuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Mengniu();
    }
}
