package springaop.aop02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * ֪ͨ�࣬�����߼�
 * ʹ��ע������
 */
@Component
@Aspect
public class Advices {

    @Before("execution(* springaop.aop02.Math.*(..))")
    public void before(JoinPoint jp) {
        System.out.println("----------ǰ��֪ͨ----------");
        System.out.println(jp.getSignature().getName());
    }

    @After("execution(* springaop.aop02.Math.*(..))")
    public void after(JoinPoint jp) {
        System.out.println("----------����֪ͨ----------");
    }
}