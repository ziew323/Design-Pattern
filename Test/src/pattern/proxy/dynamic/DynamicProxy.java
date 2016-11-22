package pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import pattern.proxy.Subject;

public class DynamicProxy<T> {
    /** 
     * 创建动态代理类 
     * @return object(代理类) 
     */
    @SuppressWarnings("unchecked")
    public static <T> T createProxy(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) {
        return (T) Proxy.newProxyInstance(loader, interfaces, h);
    }

    /** 
     * 创建动态代理类 (侵入业务场景)
     * @return object(代理类) 
     */
    @SuppressWarnings("unchecked")
    public static <T> T createProxy(Subject subject) {
        ClassLoader loader = subject.getClass().getClassLoader();
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        InvocationHandler handler = new LogHandler(subject);
        return (T) Proxy.newProxyInstance(loader, interfaces, handler);
    }
}
