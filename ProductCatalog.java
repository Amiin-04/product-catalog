import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    private List<Product> products;

    // Constructor
    public ProductCatalog() {
        this.products = new ArrayList<>();
    }

    // Method to add a product
    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to the catalog.");
    }

    // Method to display all products
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("The catalog is empty.");
        } else {
            System.out.println("Product Catalog:");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    // Method to find a product by name
    public Product findProduct(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        System.out.println("Product not found: " + name);
        return null;
    }
}