package com.example.proxy.demo2;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 *
 * Cglib子类代理工厂
 *  - 代码大部分都是模板代码，只有标记处是需要根据业务需要来修改填充的
 * Project <demo-project>
 * Created by jorgezhong on 2019/6/25 10:27.
 */
public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }


    public Object getProxyInstance() {

        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\code");

        //工具类
        Enhancer enhancer = new Enhancer();

        //设置父类
        enhancer.setSuperclass(target.getClass());

        //设置回掉函数
        enhancer.setCallback(this);

        //创建子类(代理对象)
        return enhancer.create();

    }

    @Override
    public Object intercept(Object sub, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println("代理前：向观众问好");
        //执行目标对象的方法
        Object returnValue = method.invoke(target, args);
//        Object returnValue = methodProxy.invokeSuper(sub, args);
        System.out.println("代理后：向观众问好");
        return returnValue;
    }
}
