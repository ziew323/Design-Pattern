package springaop.aop04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * ֪ͨ�࣬�����߼�
 * AspectJ֪ͨע��
 */
@Component
@Aspect
public class Advices {
    //�е�
    @Pointcut("execution(* springaop.aop04.Math.*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void before(JoinPoint jp) {
        System.out.println("----------ǰ��֪ͨ----------");
        System.out.println(jp.getSignature().getName());
    }

    @After("pointcut()")
    public void after(JoinPoint jp) {
        System.out.println("----------����֪ͨ----------");
    }

    //����֪ͨ
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println(pjp.getSignature().getName());
        System.out.println("----------����ǰ��----------");
        Object result = pjp.proceed();
        System.out.println("----------���ƺ���----------");
        return result;
    }

    //���ؽ��֪ͨ
    @AfterReturning(pointcut = "pointcut()", returning = "result")
    public void afterReturning(JoinPoint jp, Object result) {
        System.out.println(jp.getSignature().getName());
        System.out.println("����ǣ�" + result);
        System.out.println("----------���ؽ��----------");
    }

    //�쳣��֪ͨ
    @AfterThrowing(pointcut = "pointcut()", throwing = "exp")
    public void afterThrowing(JoinPoint jp, Exception exp) {
        System.out.println(jp.getSignature().getName());
        System.out.println("�쳣��Ϣ��" + exp.getMessage());
        System.out.println("----------�쳣֪ͨ----------");
    }
}