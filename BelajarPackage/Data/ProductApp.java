package BelajarPackage.Data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Mac Book Pro", 3000000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
