package com.example.decorator.demo0;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/18 16:00.
 *
 * 饮料
 */
public abstract class Beverage {

    protected String discription = "unknown beverage";

    public String getDiscription() {
        return discription;
    }

    /**
     * 计算价格
     * @return
     */
    public abstract double cost();

}
