import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create multiple products
        Product[] products = {
            new Product("Laptop", 1200.99, "Electronics", 5),
            new Product("Smartphone", 699.99, "Electronics", 10),
            new Product("Headphones", 149.99, "Accessories", 8),
            new Product("Backpack", 49.99, "Fashion", 15),
            new Product("Water Bottle", 19.99, "Home", 20)
        };

        boolean continueShopping = true;

        while (continueShopping) {
            // Display available products
            System.out.println("\nAvailable Products:");
            for (int i = 0; i < products.length; i++) {
                System.out.println((i + 1) + ". " + products[i]);
            }

            // Select product
            System.out.print("\nSelect a product by number (1-5): ");
            int productIndex = scanner.nextInt() - 1;

            if (productIndex < 0 || productIndex >= products.length) {
                System.out.println("Invalid selection. Try again.");
                continue;
            }

            Product selectedProduct = products[productIndex];

            // Hubi in stock jiro
            if (selectedProduct.isOutOfStock()) {
                System.out.println("This product is out of stock!");
                continue;
            }

            // Get quantity to buy
            System.out.print("Enter quantity to buy: ");
            int quantity = scanner.nextInt();
            selectedProduct.reduceStock(quantity);

            // Hubi haddii product-ka uu dhammaaday
            if (selectedProduct.isOutOfStock()) {
                System.out.println("This product is now out of stock!");
            }

            // Ask user if they want to continue
            System.out.print("\nDo you want to continue shopping? (haa/maya): ");
            scanner.nextLine();  // Clear buffer
            String response = scanner.nextLine().trim().toLowerCase();

            if (response.equals("maya")) {
                continueShopping = false;
            }
        }

        System.out.println("Thanks for shopping! Goodbye!");
        scanner.close();
    }
}