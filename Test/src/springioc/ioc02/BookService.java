package springioc.ioc02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * ͼ��ҵ����
 */
@Service
public class BookService {
    IBookDAO bookDAO;

    @SuppressWarnings("resource")
    public void storeBook(String bookname) {
        //����
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc02.xml");
        //�������л��idΪbookdao��bean
        bookDAO = (IBookDAO) ctx.getBean("bookDAO");
        System.out.println("ͼ���ϻ�");
        String result = bookDAO.addBook(bookname);
        System.out.println(result);
    }
}