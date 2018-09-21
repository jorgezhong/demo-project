package com.example.factory.demo1.pizza;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/20 8:56.
 * <p>
 * Pizza定义了Pizza的制作工序
 */
public abstract class Pizza {

    public void prepare() {
        System.out.println("准备材料");
    }

    public void bake() {
        System.out.println("烤");
    }

    public void cut() {
        System.out.println("切");
    }

    public void box() {
        System.out.println("包装");
    }

}
