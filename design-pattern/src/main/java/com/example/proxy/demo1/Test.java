package com.example.proxy.demo1;

import java.lang.reflect.Proxy;

/**
 * 动态代理：JDK代理大部分都模板代码，因为底层封装了具体实现，只有标记处的代码是需要自己写的。
 *  - 静态代理和动态代理都需要目标对象和代理对象都实现同一个接口
 *
 * Project <demo-project>
 * Created by jorgezhong on 2019/6/25 9:48.
 */
public class Test {

    public static void main(String[] args) {

        Singer target = new Singer();

        Object proxyInstance = Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args1) -> {
                    System.out.println("代理前：向观众问好");
                    Object returnValue = method.invoke(target, args1);
                    System.out.println("代理后：向观众问好");
                    return returnValue;
                });

        ISinger singerProxy = (ISinger) proxyInstance;

        singerProxy.sing();
    }

}
