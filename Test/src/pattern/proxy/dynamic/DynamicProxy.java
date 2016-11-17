package pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import pattern.proxy.Subject;

public class DynamicProxy<T> {
    /** 
     * ������̬������ 
     * @return object(������) 
     */
    @SuppressWarnings("unchecked")
    public static <T> T createProxy(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) {
        return (T) Proxy.newProxyInstance(loader, interfaces, h);
    }

    /** 
     * ������̬������ (����ҵ�񳡾�)
     * @return object(������) 
     */
    @SuppressWarnings("unchecked")
    public static <T> T createProxy(Subject subject) {
        ClassLoader loader = subject.getClass().getClassLoader();
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        InvocationHandler handler = new LogHandler(subject);
        return (T) Proxy.newProxyInstance(loader, interfaces, handler);
    }
}
