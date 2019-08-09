package com.example.proxy.demo0;

/**
 * 代理对象和目标对象实现同一个接口
 *
 * Project <demo-project>
 * Created by jorgezhong on 2019/6/25 9:28.
 */
public class SingerProxy implements ISinger {

    //代理对象通过构造方法传入，持有目标对象
    private ISinger target;

    public SingerProxy(ISinger target) {
        this.target = target;
    }

    /**
     * 对目标对象的sing()方法进行拓展
     */
    @Override
    public void sing() {

        System.out.println("代理前：向观众问好");
        target.sing();
        System.out.println("代理后：向观众问好");
    }
}
