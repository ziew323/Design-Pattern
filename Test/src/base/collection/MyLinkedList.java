package base.collection;

public class MyLinkedList implements MyList {

    public static void main(String[] args) {
        MyList list = new MyLinkedList();
        list.add(1);
        list.add("2");
        System.out.println(list.toString());
        System.out.println(list.contains(2));
    }

    private int size;

    private Node first;

    private Node last;

    private class Node {
        public Node(Node prev, Object element, Node next) {
            this.prev = prev;
            this.element = element;
            this.next = next;
        }

        Object element;

        Node next;

        Node prev;
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
        if (indexOf(o) < 0) {
            return false;
        }
        return true;
    }

    private int indexOf(Object o) {
        Node node = first;
        if (node == null) {
            return -1;
        }
        if (o == null) {
            for (int i = 0; node.next != null; node = node.next) {
                if (node.element == null) {
                    return i;
                }
                i++;
            }
        } else {
            for (int i = 0; node.next != null; node = node.next) {
                if (o.equals(node.element)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    @Override
    public boolean add(Object o) {
        Node l = last;
        Node newNode = new Node(l, o, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
        return true;
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

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MyLinkedList {size=").append(size)
            .append(", elementData=[");
        for (Node node = first; node != null; node = node.next) {
            stringBuilder.append(node.element);
            if (node.next != null) {
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]}");
        return stringBuilder.toString();
    }

}
