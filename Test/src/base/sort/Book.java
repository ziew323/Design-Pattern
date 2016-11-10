package base.sort;

public class Book implements Comparable<Book> {
    private int id;

    private String name;

    private double price;

    public Book(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Book book) {
        return Double.valueOf(price).compareTo(book.getPrice());
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("id=").append(id).append(",name=").append(name).append(",price=").append(price);
        return stringBuffer.toString();
    }
}
