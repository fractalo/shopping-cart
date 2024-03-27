package shoppingCart;

public class Product {
    private String id;
    private String name;
    private int price;

    Product(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public int hashCode() {
        if (id == null) return 0;
        return id.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;

        if (object instanceof Product product) {
            return id.equals(product.getId());
        }
        return false;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
