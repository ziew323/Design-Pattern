package springaop.aop01;

import org.aspectj.lang.JoinPoint;

/**
 * ֪ͨ�࣬�����߼�
 * ����xml����
 */
public class Advices {

    public void before(JoinPoint jp) {
        System.out.println("----------ǰ��֪ͨ----------");
        System.out.println(jp.getSignature().getName());
    }

    public void after(JoinPoint jp) {
        System.out.println("----------����֪ͨ----------");
    }
}