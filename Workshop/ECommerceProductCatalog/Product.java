import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Product extends Item {
    public static HashMap<UUID,Product> products = new HashMap<>();
    Product(String name, String category, int price){
        super(name,category,price);
        products.put(this.id, this);
    }

    static void displayProducts(){
        System.out.println("-----Product Details-----");
        for(UUID id: products.keySet()){
            System.out.println(products.get(id));
            System.out.println("--------------");
        }
    }

    public void updatePrice(int price){
        this.setPrice(price);
    }

    public void deleteProduct(){
        products.remove(this.id);
        System.out.println("Product Deleted");
    }
}
