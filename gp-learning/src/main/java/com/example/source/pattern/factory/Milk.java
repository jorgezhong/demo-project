package com.example.source.pattern.factory;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2019/8/9 15:37.
 */
public interface Milk {

    String TELUNSU = "特仑苏";
    String YILI = "伊利";
    String MENGNIU = "蒙牛";

    /**
     * 获取一个标准产品
     * @return
     */
    String getName();

}
