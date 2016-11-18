package springaop.aop03;

import org.springframework.stereotype.Component;

@Component("strUtil")
public class StrUtil {
    @MyAnno
    public void show() {
        System.out.println("Hello StrUtil!");
    }
}