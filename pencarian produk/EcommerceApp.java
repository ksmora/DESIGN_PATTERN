public class EcommerceApp {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", "Electronics", 1000));
        products.add(new Product("T-Shirt", "Fashion", 25));
        products.add(new Product("Book", "Books", 20));
        products.add(new Product("Phone", "Electronics", 500));

        ProductSearch productSearch = new ProductSearch(products);

        // Cari produk dengan keyword "Phone"
        List<Product> searchResult = productSearch.search("Phone");

        // Tampilkan hasil pencarian
        for (Product product : searchResult) {
            System.out.println(product.getName() + " - " + product.getCategory() + " - " + product.getPrice());
        }
    }
}
