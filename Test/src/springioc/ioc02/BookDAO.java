package springioc.ioc02;

import org.springframework.stereotype.Repository;

/**
 * ͼ�����ݷ���ʵ����
 */
@Repository
public class BookDAO implements IBookDAO {

    public String addBook(String bookname) {
        return "���ͼ��" + bookname + "�ɹ���";
    }
}