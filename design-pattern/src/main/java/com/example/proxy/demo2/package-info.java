/**
 * 由于静态代理和动态代理都是需要目标兑现和代理对象实现同样一个或多个接口的
 * 如果一个接口都没有，可以了解下Cglib代理
 *
 *  - spring的核心包里面已经包含了cglib功能, 比如：spring-core-5.0.8jar
 *
 *  - 目标类不能为final,如果目标对象是final/static,那么就不会被拦截，即不会执行目标对象额外的业务方法
 * Project <demo-project>
 * Created by jorgezhong on 2019/6/25 9:57.
 */
package com.example.proxy.demo2;