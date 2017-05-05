package base.collection;

public class MyLinkedList implements MyList {

    public static void main(String[] args) {
        MyList list = new MyLinkedList();
        list.add(1);
        list.add("2");
        System.out.println(list.toString());
        System.out.println(list.contains(2));
        list.set(1, "3");
        System.out.println(list.toString());
        System.out.println(list.get(1));
        list.remove(0);
        System.out.println(list.toString());
        list.remove(new String("3"));
        System.out.println(list.toString());
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

    private int indexOf(Object element) {
        Node node = first;
        if (node == null) {
            return -1;
        }
        if (element == null) {
            for (int i = 0; node != null; node = node.next) {
                if (node.element == null) {
                    return i;
                }
                i++;
            }
        } else {
            for (int i = 0; node != null; node = node.next) {
                if (element.equals(node.element)) {
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
    public boolean remove(Object element) {
        System.out.println(element instanceof String);
        int index = indexOf(element);
        if (index >= 0) {
            unlink(node(index));
            return true;
        }
        return false;
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        return node(index).element;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size - 1) {
            throw new RuntimeException();
        }
    }

    private Node node(int index) {
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    @Override
    public Object set(int index, Object element) {
        checkIndex(index);
        Node node = node(index);
        Object oldElement = node.element;
        node.element = element;
        return oldElement;
    }

    @Override
    public void add(int index, Object element) {
        // TODO Auto-generated method stub

    }

    @Override
    public Object remove(int index) {
        checkIndex(index);
        return unlink(node(index));
    }

    private Object unlink(Node node) {
        Object element = node.element;
        Node prev = node.prev;
        Node next = node.next;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            node.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            node.next = null;
        }

        node.element = null;
        size--;
        return element;
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
