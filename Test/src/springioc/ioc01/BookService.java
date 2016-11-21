package springioc.ioc01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ͼ��ҵ����
 */
public class BookService {
    IBookDAO bookDAO;

    public BookService() {
        //����
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc01.xml");
        //�������л��idΪbookdao��bean
        bookDAO = (IBookDAO) ctx.getBean("bookdao");
    }

    public void storeBook(String bookname) {
        System.out.println("ͼ���ϻ�");
        String result = bookDAO.addBook(bookname);
        System.out.println(result);
    }
}