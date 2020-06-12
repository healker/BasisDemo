package healker.pattern.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author healker
 * @version 1.0
 * @date 2020/5/10 11:44
 * @email healkerzk@163.com
 */
public class CglibProxy implements MethodInterceptor {
    private Object target;

    public Object newInstance(Object object) {
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(this);
        enhancer.setSuperclass(object.getClass());
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object obj = methodProxy.invoke(o, objects);
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
