import java.util.ArrayList;

public class ShoppingCart {
    static class CartItem {
        String itemName;
        double price;
        int quantity;

        CartItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        double getTotal() {
            return price * quantity;
        }
    }

    ArrayList<CartItem> items = new ArrayList<>();

    void addItem(String name, double price, int quantity) {
        items.add(new CartItem(name, price, quantity));
    }

    void removeItem(String name) {
        items.removeIf(i -> i.itemName.equals(name));
    }

    void displayTotalCost() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotal();
        }
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Book", 200, 2);
        cart.addItem("Pen", 10, 5);
        cart.removeItem("Pen");
        cart.displayTotalCost();
    }
}