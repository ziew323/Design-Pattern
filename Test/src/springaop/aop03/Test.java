package springaop.aop03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aop03.xml");
        StrUtil strUtil = ctx.getBean("strUtil", StrUtil.class);
        strUtil.show();
    }

}