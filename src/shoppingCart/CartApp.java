package shoppingCart;

import java.util.HashSet;
import java.util.Set;

public class CartApp {
    public static void main(String[] args) {
        Set<Product> productSet = new HashSet<>();

        Product milk = new Product("1", "우유", 2500);
        Product tissue = new Product("2", "화장지", 1500);
        Product orange = new Product("3", "오렌지", 2000);

        productSet.add(milk);
        productSet.add(tissue);
        productSet.add(orange);

        System.out.println("고유한 상품 목록:");
        for (Product product : productSet) {
            System.out.println(product.getName() + " : " + product.getPrice());
        }
        System.out.println();

        Cart myCart = new Cart();
        for (Product product : productSet) {
            int quantity = (int) (Math.random() * 10);
            myCart.addProduct(product, quantity);
        }

        myCart.showItems();

        myCart.removeProduct(tissue, 2);

        myCart.showItems();

    }
}
