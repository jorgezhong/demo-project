/**
 * 三种代理主要还是看是否实现了接口
 *  - 没有实现接口的是cglib
 *  - 静态代理和动态代理实现了接口
 *
 * 在Spring Aop中
 *  - 如果加入容器的目标对象有实现接口，用JDK代理
 *  - 如果加入容器的对象没有实现接口，用cglib代理
 *
 * Project <demo-project>
 * Created by jorgezhong on 2019/6/25 10:47.
 */
package com.example.proxy;