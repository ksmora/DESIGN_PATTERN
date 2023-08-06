import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<ShoppingCartItem> items;

    private ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(ShoppingCartItem item) {
        items.add(item);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (ShoppingCartItem item : items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }

    public static class ShoppingCartBuilder {
        private ShoppingCart cart;

        public ShoppingCartBuilder() {
            cart = new ShoppingCart();
        }

        public ShoppingCartBuilder addItem(ShoppingCartItem item) {
            cart.addItem(item);
            return this;
        }

        public ShoppingCart build() {
            return cart;
        }
    }
}
