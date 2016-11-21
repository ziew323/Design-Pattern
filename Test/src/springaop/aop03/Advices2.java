package springaop.aop03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 通知类，横切逻辑
 *
 */
@Component
@Aspect
public class Advices2 {

    //@annotation切点函数
    //要求方法必须被注解com.zhangguo.Spring052.aop03.MyAnno才会被织入横切逻辑
    @After("@annotation(springaop.aop03.MyAnno)")
    public void after5(JoinPoint jp) {
        System.out.println("----------最终通知@annotation切点函数----------");
    }
}