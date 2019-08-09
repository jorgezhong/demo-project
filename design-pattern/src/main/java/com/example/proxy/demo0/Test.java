package com.example.proxy.demo0;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2019/6/25 9:32.
 */
public class Test {

    public static void main(String[] args) {
        //目标对象
        ISinger singer = new Singer();
        //代理对象
        SingerProxy singerProxy = new SingerProxy(singer);
        //执行的是代理对象的方法
        singerProxy.sing();

    }

}
