public class Product implements StockItem {
    private String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public void updateStock(int quantity) {
        stock += quantity;
    }
}
