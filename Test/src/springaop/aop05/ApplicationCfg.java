package springaop.aop05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration //���ڱ�ʾ��ǰ��Ϊ�����������࣬����<beans/>
@ComponentScan(basePackages = "springaop.aop05") //ɨ��ķ�Χ���൱��xml���õĽ��<context:component-scan/>
@EnableAspectJAutoProxy(proxyTargetClass = true) //�Զ������൱��<aop:aspectj-autoproxy proxy-target-class="true"></aop:aspectj-autoproxy>
public class ApplicationCfg {
    //������������һ��bean���൱��<bean id=getUser class="springaop.aop05.User"/>
    @Bean
    public User getUser() {
        return new User();
    }
}