package com.example.source.pattern.factory.abstract_;

import com.example.source.pattern.factory.Milk;
import com.example.source.pattern.factory.function.MengniuFactory;
import com.example.source.pattern.factory.function.TelunsuFactory;
import com.example.source.pattern.factory.function.YiliFactory;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2019/8/9 17:29.
 */
public class MilkFactory extends AbstractFactory {
    @Override
    public Milk getMengniu() {
        return new MengniuFactory().getMilk();
    }

    @Override
    public Milk getYili() {
        return new YiliFactory().getMilk();
    }

    @Override
    public Milk getTelunsu() {
        return new TelunsuFactory().getMilk();
    }
}
