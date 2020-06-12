package com.pattern.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * @author healk
 */
public class JdkProxy implements InvocationHandler {
    private Object target;

    /**
     * 拿到目标对象
     * @param obj
     * @return
     */
    public Object getInstance(Object obj){
        this.target = obj;
        Class<?> clazz =  target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target, args);
        after();
        return result;
    }

    private void after() {
        System.out.println("完成订单");
    }

    private void before() {
        System.out.println("跑腿，接收等订单");
    }
}
