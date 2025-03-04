public class Product {
    private String name;
    private double price;
    private String category;
    private int stock;

    public Product(String name, double price, String category, int stock) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }
    public int getStock() { return stock; }

    public void reduceStock(int quantity) {
        if (quantity > 0 && quantity <= stock) {
            stock -= quantity;
            System.out.println(quantity + " items sold. Remaining stock: " + stock);
        } else {
            System.out.println("Invalid quantity or insufficient stock.");
        }
    }

    public boolean isOutOfStock() {
        return stock <= 0;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + 
               ", category='" + category + "', stock=" + stock + "}";
    }
}