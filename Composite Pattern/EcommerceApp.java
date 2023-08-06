public class EcommerceApp {
    public static void main(String[] args) {
        // Membuat beberapa produk tunggal
        Product product1 = new Product("Laptop", 10);
        Product product2 = new Product("T-Shirt", 50);
        Product product3 = new Product("Book", 30);

        // Membuat kelompok produk
        ProductGroup electronicsGroup = new ProductGroup("Electronics");
        electronicsGroup.add(product1);
        electronicsGroup.add(product2);

        ProductGroup fashionGroup = new ProductGroup("Fashion");
        fashionGroup.add(product2);
        fashionGroup.add(product3);

        // Menampilkan stok produk dan kelompok produk
        System.out.println("Stok " + product1.getName() + ": " + product1.getStock());
        System.out.println("Stok " + product2.getName() + ": " + product2.getStock());
        System.out.println("Stok " + product3.getName() + ": " + product3.getStock());

        System.out.println("Stok " + electronicsGroup.getName() + ": " + electronicsGroup.getStock());
        System.out.println("Stok " + fashionGroup.getName() + ": " + fashionGroup.getStock());

        // Update stok kelompok produk
        electronicsGroup.updateStock(5);
        fashionGroup.updateStock(-10);

        // Menampilkan stok produk dan kelompok produk setelah update
        System.out.println("Stok " + product1.getName() + ": " + product1.getStock());
        System.out.println("Stok " + product2.getName() + ": " + product2.getStock());
        System.out.println("Stok " + product3.getName() + ": " + product3.getStock());

        System.out.println("Stok " + electronicsGroup.getName() + ": " + electronicsGroup.getStock());
        System.out.println("Stok " + fashionGroup.getName() + ": " + fashionGroup.getStock());
    }
}
