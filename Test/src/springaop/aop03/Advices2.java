package springaop.aop03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * ֪ͨ�࣬�����߼�
 *
 */
@Component
@Aspect
public class Advices2 {

    //@annotation�е㺯��
    //Ҫ�󷽷����뱻ע��com.zhangguo.Spring052.aop03.MyAnno�Żᱻ֯������߼�
    @After("@annotation(springaop.aop03.MyAnno)")
    public void after5(JoinPoint jp) {
        System.out.println("----------����֪ͨ@annotation�е㺯��----------");
    }
}