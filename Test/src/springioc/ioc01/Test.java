package springioc.ioc01;

public class Test {
    @org.junit.Test
    public void testStoreBook() {
        BookService bookservice = new BookService();
        bookservice.storeBook("《Spring MVC权威指南 第一版》");
    }
}