package pattern.proxy.dynamic;

import pattern.proxy.RealSubject;
import pattern.proxy.Subject;

public class ActionTest {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        //创建代理对象  
        LogHandler handler = new LogHandler(subject);
        Subject proxy1 = DynamicProxy.createProxy(subject.getClass().getClassLoader(),
            subject.getClass().getInterfaces(), handler);
        proxy1.request();

        Subject proxy2 = DynamicProxy.createProxy(subject);
        proxy2.request();
    }
}