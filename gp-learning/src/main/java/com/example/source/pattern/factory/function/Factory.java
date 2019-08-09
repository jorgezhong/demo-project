package com.example.source.pattern.factory.function;

import com.example.source.pattern.factory.Milk;

/**
 * 定义工厂的标准
 * 实现规模生产
 *
 * Project <demo-project>
 * Created by jorgezhong on 2019/8/9 17:04.
 */
public interface Factory {

    /**
     * 工厂必然具有生产产品的技能，统一的产品出口
     * @return
     */
    Milk getMilk();

}
