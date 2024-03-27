package shoppingCart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> items = new HashMap<>();

    public void addProduct(Product product, int quantity) {
        int currentQuantity = items.getOrDefault(product, 0);

        items.put(product, currentQuantity + quantity);
    }

    public void removeProduct(Product product, int quantity) {
        int currentQuantity = items.getOrDefault(product, 0);
        if (currentQuantity > quantity) {
            items.put(product, currentQuantity - quantity);
        } else {
            items.remove(product);
        }
    }

    public void showItems() {
        System.out.println("<장바구니>");
        for (Product product : items.keySet()) {
            int quantity = items.getOrDefault(product, 0);
            System.out.println(product.getName() + " : " + quantity + "개");
        }
        System.out.println();
    }

}
