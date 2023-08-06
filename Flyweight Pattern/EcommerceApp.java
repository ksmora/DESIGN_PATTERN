EcommerceApppublic class EcommerceApp {
    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();

        // Mendapatkan produk dari pabrik
        Product product1 = productFactory.getProduct("123");
        Product product2 = productFactory.getProduct("456");
        Product product3 = productFactory.getProduct("123");

        // Menampilkan produk
        product1.display(); // Produk dengan key "123" diambil dari pabrik
        product2.display(); // Produk dengan key "456" diambil dari pabrik
        product3.display(); // Produk dengan key "123" diambil dari cache, karena sudah ada sebelumnya
    }
}
