public class EcommerceApp {
    public static void main(String[] args) {
        ShoppingCartItem item1 = new ShoppingCartItem("Laptop", 1500.0, 2);
        ShoppingCartItem item2 = new ShoppingCartItem("Mouse", 25.0, 3);

        ShoppingCart cart = new ShoppingCart.ShoppingCartBuilder()
                .addItem(item1)
                .addItem(item2)
                .build();

        System.out.println("Total Harga Keranjang: $" + cart.getTotalPrice());
    }
}

//Total Harga Keranjang: $3075.0