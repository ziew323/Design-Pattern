package base.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        Sort sort = new Sort();
        sort.sortByComparable();
        //sort.sortByComparator();
    }

    public enum ListType

    {
        ArrayList, LinkedList;

        public List<Book> getList() {
            switch (this) {
            case ArrayList:
                return new ArrayList<Book>();
            case LinkedList:
                return new LinkedList<Book>();
            }
            return null;
        }

    }

    public void sortByComparable() {
        int size = 100;
        List<Book> list = getBooks(size, ListType.ArrayList);
        long beginTime = System.currentTimeMillis();
        Collections.sort(list);
        System.out.println("time:" + (System.currentTimeMillis() - beginTime));
        //print(list);
        List<Book> list1 = getBooks(size, ListType.LinkedList);
        beginTime = System.currentTimeMillis();
        Collections.sort(list1, new MyBookComparator());
        System.out.println("time:" + (System.currentTimeMillis() - beginTime));
        //print(list1);
    }

    public List<Book> getBooks(int size, ListType type) {
        List<Book> books = type.getList();
        Random random = new Random(size * 10);
        for (int i = 0; i < size; i++) {
            books.add(new Book(i + 1, "Êé" + i, random.nextDouble()));
        }
        return books;
    }

    public void sortByComparator() {
        List<Fruit> list = new ArrayList<Fruit>();
        list.add(new Fruit("Æ»¹û", 5.00));
        list.add(new Fruit("Ïã½¶", 6.00));
        list.add(new Fruit("éÙ×Ó", 4.00));
        Collections.sort(list, new MyFruitComparator());
        print(list);

    }

    public void print(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
