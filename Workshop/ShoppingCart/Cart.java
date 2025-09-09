import java.util.HashMap;


public class Cart {
    HashMap<Product,Integer> cart;

    Cart(){
        cart = new HashMap<>();
    }

    void addProduct(String name, double price, int qty){
        Product product = new Product(name, price);
        cart.put(product,cart.getOrDefault(product,0)+qty);
        System.out.println("Item added to cart");
    }



    void displayItems(){

        for(Product product:cart.keySet()){
            System.out.println(product.name+" : "+product.price+" : "+cart.get(product));
        }
    }
}
