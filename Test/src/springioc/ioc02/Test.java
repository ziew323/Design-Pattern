package springioc.ioc02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @SuppressWarnings("resource")
    @org.junit.Test
    public void testStoreBook() {
        //容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc02.xml");
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.storeBook("《Spring MVC权威指南 第二版》");
    }
}