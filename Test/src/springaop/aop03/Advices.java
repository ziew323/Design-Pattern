package springaop.aop03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 通知类，横切逻辑
 * AspectJ切点函数
 */
@Component
@Aspect
public class Advices {
    @Before("execution(* springaop.aop03.*.*(..))")
    public void before(JoinPoint jp) {
        System.out.println("----------前置通知----------");
        System.out.println(jp.getSignature().getName());
    }

    //execution切点函数
    //springaop.aop03包下所有类的所有方法被切入
    @After("execution(* springaop.aop03.*.*(..))")
    public void after1(JoinPoint jp) {
        System.out.println("----------最终通知execution切点函数----------");
    }

    //within切点函数
    //springaop.aop03包下所有类的所有方法被切入
    @After("within(springaop.aop03.*)")
    public void after2(JoinPoint jp) {
        System.out.println("----------最终通知within切点函数----------");
    }

    //this切点函数
    //实现了StrUtil接口的代理对象的任意连接点
    @After("this(springaop.aop03.StrUtil)")
    public void after3(JoinPoint jp) {
        System.out.println("----------最终通知this切点函数----------");
    }

    //args切点函数
    //要求方法有两个int类型的参考才会被织入横切逻辑
    @After("args()")
    public void after4(JoinPoint jp) {
        System.out.println("----------最终通知args切点函数----------");
    }

    //@annotation切点函数
    //要求方法必须被注解com.zhangguo.Spring052.aop03.MyAnno才会被织入横切逻辑
    @After("@annotation(springaop.aop03.MyAnno)")
    public void after5(JoinPoint jp) {
        System.out.println("----------最终通知@annotation切点函数----------");
    }
}