package springaop.aop03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * ֪ͨ�࣬�����߼�
 * AspectJ�е㺯��
 */
@Component
@Aspect
public class Advices {
    @Before("execution(* springaop.aop03.*.*(..))")
    public void before(JoinPoint jp) {
        System.out.println("----------ǰ��֪ͨ----------");
        System.out.println(jp.getSignature().getName());
    }

    //execution�е㺯��
    //springaop.aop03��������������з���������
    @After("execution(* springaop.aop03.*.*(..))")
    public void after1(JoinPoint jp) {
        System.out.println("----------����֪ͨexecution�е㺯��----------");
    }

    //within�е㺯��
    //springaop.aop03��������������з���������
    @After("within(springaop.aop03.*)")
    public void after2(JoinPoint jp) {
        System.out.println("----------����֪ͨwithin�е㺯��----------");
    }

    //this�е㺯��
    //ʵ����StrUtil�ӿڵĴ��������������ӵ�
    @After("this(springaop.aop03.StrUtil)")
    public void after3(JoinPoint jp) {
        System.out.println("----------����֪ͨthis�е㺯��----------");
    }

    //args�е㺯��
    //Ҫ�󷽷�������int���͵Ĳο��Żᱻ֯������߼�
    @After("args()")
    public void after4(JoinPoint jp) {
        System.out.println("----------����֪ͨargs�е㺯��----------");
    }

    //@annotation�е㺯��
    //Ҫ�󷽷����뱻ע��com.zhangguo.Spring052.aop03.MyAnno�Żᱻ֯������߼�
    @After("@annotation(springaop.aop03.MyAnno)")
    public void after5(JoinPoint jp) {
        System.out.println("----------����֪ͨ@annotation�е㺯��----------");
    }
}