package base.sort;

import java.util.Comparator;

public class MyBookComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return Double.valueOf(book1.getPrice()).compareTo(book2.getPrice());
    }

}
