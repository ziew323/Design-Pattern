package base.collection;

public interface MyList {
    public int size();

    public boolean isEmpty();

    public boolean contains(Object o);

    public boolean add(Object o);

    public boolean remove(Object o);

    public Object get(int index);

    public Object set(int index, Object element);

    public void add(int index, Object element);

    public Object remove(int index);
}
