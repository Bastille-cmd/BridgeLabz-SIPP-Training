public class ItemInventory {
    int itemCode;
    String itemName;
    double price;

    ItemInventory(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayDetails(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        ItemInventory item = new ItemInventory(1001, "Pen", 10);
        item.displayDetails(5);
    }
}