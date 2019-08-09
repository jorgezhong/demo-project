/**
 *
 * 动态代理：JDK代理
 *  - 调用Proxy.newProxyInstance方法，得到代理对象
 *
 * static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces,InvocationHandler h )
 *  - ClassLoader loader：指定当前类加载器，写法固定
 *  - Class<?>[] interfaces：目标类实现的接口类型，写法固定
 *  - InvocationHandler h：事件处理接口，需要传入一个实现类，一般用匿名内部类
 *
 * Project <demo-project>
 * Created by jorgezhong on 2019/6/25 9:42.
 */
package com.example.proxy.demo1;

