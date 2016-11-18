package springioc.ioc03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @SuppressWarnings("resource")
    @org.junit.Test
    public void testStoreBook() {
        //����
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc03.xml");
        BookService bookService = ctx.getBean(BookService.class);
        bookService.storeBook("��Spring MVCȨ��ָ�� �ڶ��桷");
    }
}