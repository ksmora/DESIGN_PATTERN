public class EcommerceApp {
    public static void main(String[] args) {
        PurchaseComponent purchaseHistory = new PurchaseHistory();
        purchaseHistory.show();

        System.out.println();

        PurchaseComponent sortedHistory = new SortingDecorator(new PurchaseHistory());
        sortedHistory.show();

        System.out.println();

        PurchaseComponent filteredHistory = new FilteringDecorator(new PurchaseHistory());
        filteredHistory.show();

        System.out.println();

        PurchaseComponent sortedAndFilteredHistory = new SortingDecorator(new FilteringDecorator(new PurchaseHistory()));
        sortedAndFilteredHistory.show();
    }
}
