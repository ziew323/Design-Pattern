package springioc.ioc02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * 图书业务类
 */
@Service
public class BookService {
    IBookDAO bookDAO;

    @SuppressWarnings("resource")
    public void storeBook(String bookname) {
        //容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc02.xml");
        //从容器中获得id为bookdao的bean
        bookDAO = (IBookDAO) ctx.getBean("bookDAO");
        System.out.println("图书上货");
        String result = bookDAO.addBook(bookname);
        System.out.println(result);
    }
}