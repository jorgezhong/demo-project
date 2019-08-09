package com.example.proxy.demo2;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2019/6/25 10:44.
 */
public class Test {

    public static void main(String[] args) {
        Singer target = new Singer();
        ProxyFactory proxyFactory = new ProxyFactory(target);

        Object proxyInstance = proxyFactory.getProxyInstance();

        Singer singerProxy = (Singer) proxyInstance;

        singerProxy.sing();


    }
}
