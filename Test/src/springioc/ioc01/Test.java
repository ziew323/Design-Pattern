package springioc.ioc01;

public class Test {
    @org.junit.Test
    public void testStoreBook() {
        BookService bookservice = new BookService();
        bookservice.storeBook("��Spring MVCȨ��ָ�� ��һ�桷");
    }
}