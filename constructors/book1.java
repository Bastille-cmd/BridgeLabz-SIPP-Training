package constructors;

public class book1 {
    String title;
    String author;
    double price;
    boolean available;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public void borrowBook() {
        if (available) {
            available = false;
        }
    }
}
