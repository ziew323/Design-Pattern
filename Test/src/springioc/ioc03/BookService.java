package springioc.ioc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 图书业务类
 */
@Service
public class BookService {
    @Autowired
    IBookDAO bookDAO;

    public void storeBook(String bookname) {
        System.out.println("图书上货");
        String result = bookDAO.addBook(bookname);
        System.out.println(result);
    }
}