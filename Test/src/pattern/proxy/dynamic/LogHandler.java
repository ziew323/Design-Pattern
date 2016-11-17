package pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import pattern.proxy.Subject;

public class LogHandler implements InvocationHandler {
    //Ŀ�����  
    private Object targetObject;

    public LogHandler(Subject subject) {
        targetObject = subject;
    }

    /** 
     * ������̬������ 
     * @return object(������) 
     */
    public Object createProxy(Object targetObject) {
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
            targetObject.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = null;
        try {
            beforeLog();
            //obj�� Ŀ�����--->�������ķ���ֵ--->���ظ������ߵ���Ϣ  
            //this.invoke("Ŀ�����","��������Ŀ����󴫵ݲ���");  
            //����Ŀ������з���  
            obj = method.invoke(targetObject, args);
            afterLog();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }

    //��־������  
    private void beforeLog() {
        System.out.println("��ʼִ��");
    }

    private void afterLog() {
        System.out.println("ִ�����");
    }

}