package q13;

import java.util.ArrayList;
import java.util.List;

public class ShopingCart<T extends Product> {
    public static void main(String[] args) {
        ShopingCart<ElectronicProduct> shopingCarts1 = new ShopingCart<>();
        ShopingCart<SportsProduct> shopingCarts2 = new ShopingCart<>();
        ElectronicProduct electronicProduct = new ElectronicProduct("fridge",500);
        shopingCarts1.addProduct(electronicProduct);
        shopingCarts2.addProduct((new SportsProduct("Shoes",200)));
        shopingCarts1.removeProduct(electronicProduct);
        System.out.println(shopingCarts1);
        System.out.println(shopingCarts2);

    }

    private List<T> products = new ArrayList<>();

    public void addProduct(T product) {
        products.add(product);
    }
    public void removeProduct(T product) {
        products.remove(product);
    }

    public List<T> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "ShopingCart{" +
                "products=" + products +
                '}';
    }
}

