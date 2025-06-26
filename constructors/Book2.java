package constructors;

public class Book2 {
    public String ISBN;
    protected String title;
    private String author;

    public Book2(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book2 {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void printBasicInfo() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title);
    }
}
