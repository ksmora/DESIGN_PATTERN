import java.util.HashMap;
import java.util.Map;

public class ProductFactory {
    private Map<String, Product> products;

    public ProductFactory() {
        products = new HashMap<>();
    }

    public Product getProduct(String key) {
        // Jika produk dengan key yang sama sudah ada, kembalikan produk yang sudah ada
        if (products.containsKey(key)) {
            return products.get(key);
        } else {
            // Jika produk dengan key yang sama belum ada, buat produk baru dan tambahkan ke daftar produk
            Product product = new ConcreteProduct("Product " + key, "Brand " + key, "Category " + key, 100.0);
            products.put(key, product);
            return product;
        }
    }
}
