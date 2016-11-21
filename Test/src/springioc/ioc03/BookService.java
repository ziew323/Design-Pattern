package springioc.ioc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ͼ��ҵ����
 */
@Service
public class BookService {
    @Autowired
    IBookDAO bookDAO;

    public void storeBook(String bookname) {
        System.out.println("ͼ���ϻ�");
        String result = bookDAO.addBook(bookname);
        System.out.println(result);
    }
}