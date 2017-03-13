package base.collection;

public class MyLinkedList implements MyList {

    public static void main(String[] args) {

    }

    private int size;

    private Node first;

    private Node last;

    private class Node {
        Object element;

        Node nextNode;

        Node prevNode;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    private int indexOf(Object o) {
        return 0;
    }

    @Override
    public boolean add(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Object get(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void add(int index, Object element) {
        // TODO Auto-generated method stub

    }

    @Override
    public Object remove(int index) {
        // TODO Auto-generated method stub
        return null;
    }

}
