package springioc.ioc03;

import org.springframework.stereotype.Repository;

/**
 * ͼ�����ݷ���ʵ����
 */
@Repository("bookDAO")
public class BookDAO implements IBookDAO {

    public String addBook(String bookname) {
        return "���ͼ��" + bookname + "�ɹ���";
    }
}