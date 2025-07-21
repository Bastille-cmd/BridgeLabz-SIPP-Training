class BookCategory {}
class ClothingCategory {}
class GadgetCategory {}

class Product<T> {
    String name;
    double price;
    T category;
    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public String toString() {
        return name + " - " + price;
    }
}

class Catalog {
    static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.price -= product.price * (percentage / 100);
    }
}

public class OnlineMarketplace {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Book", 500, new BookCategory());
        Catalog.applyDiscount(book, 10);
        System.out.println(book);
    }
}