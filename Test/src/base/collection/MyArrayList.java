package base.collection;

import java.util.Arrays;

public class MyArrayList implements MyList {

    public static void main(String[] args) {
        MyList list = new MyArrayList();
        list.add(1);
        list.add(2);
        list.add(3.0);
        list.add("4");
        list.add(null);
        System.out.println(list.toString());
        list.add(1, "1");
        System.out.println(list.toString());
        list.set(1, "2");
        System.out.println(list.toString());
        list.remove(1);
        System.out.println(list.toString());
        list.remove(null);
        System.out.println(list.toString());
    }

    private Object[] elementData;

    private int size;

    public MyArrayList() {
        elementData = new Object[] {};
    }

    public MyArrayList(int size) {
        elementData = new Object[size];
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
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elementData[i] == null) {
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elementData[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean add(Object o) {
        ensureCapacityInternal(size + 1);
        elementData[size++] = o;
        return true;
    }

    private void ensureCapacityInternal(int minCapacity) {
        if (minCapacity > elementData.length) {
            grow(minCapacity);
        }
    }

    private void grow(int minCapacity) {
        int newCapacity = elementData.length * 2 + 1;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    @Override
    public boolean remove(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elementData[i] == null) {
                    fastRemove(i);
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elementData[i])) {
                    fastRemove(i);
                    return true;
                }
            }
        }
        return false;
    }

    private void fastRemove(int index) {
        int numMoved = size - index - 1;
        System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        elementData[--size] = null;
    }

    @Override
    public Object get(int index) {
        rangeCheck(index);
        return elementData[index];
    }

    private void rangeCheck(int index) {
        if (index >= size) {
            throw new RuntimeException();
        }
    }

    private void rangeCheckForAdd(int index) {
        if (index < 0 || index > size) {
            throw new RuntimeException();
        }
    }

    @Override
    public Object set(int index, Object element) {
        rangeCheck(index);
        Object oldElement = elementData[index];
        elementData[index] = element;
        return oldElement;
    }

    @Override
    public void add(int index, Object element) {
        rangeCheckForAdd(index);
        ensureCapacityInternal(size + 1);
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = element;
        size++;
    }

    @Override
    public Object remove(int index) {
        rangeCheck(index);
        Object oldElement = elementData[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--size] = null;
        return oldElement;
    }

    @Override
    public String toString() {
        return "MyArrayList [elementData=" + Arrays.toString(elementData) + ", size=" + size + ", toString()="
            + super.toString() + "]";
    }

}
