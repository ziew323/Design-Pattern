package springioc.ioc01;

/**
 * ͼ�����ݷ���ʵ����
 */
public class BookDAO implements IBookDAO {

    public String addBook(String bookname) {
        return "���ͼ��" + bookname + "�ɹ���";
    }
}