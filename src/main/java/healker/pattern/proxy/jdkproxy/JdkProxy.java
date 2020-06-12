package healker.pattern.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author healker
 * @version 1.0
 * @date 2020/5/10 10:39
 * @email healkerzk@163.com
 */
public class JdkProxy implements InvocationHandler {
    private Object target;

    Object newInstance(Object object) {
        this.target = object;
        Class<?> clazz = target.getClass();

        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target, args);
        after();
        return obj;
    }

    private void before() {
        System.out.println("---代理增强--执行前---");
    }

    private void after() {
        System.out.println("---代理增强--执行后---");
    }
}
