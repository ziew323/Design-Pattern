package springioc.ioc02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @SuppressWarnings("resource")
    @org.junit.Test
    public void testStoreBook() {
        //����
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc02.xml");
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.storeBook("��Spring MVCȨ��ָ�� �ڶ��桷");
    }
}