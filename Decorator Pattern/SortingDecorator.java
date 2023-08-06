public class SortingDecorator extends Decorator {
    public SortingDecorator(PurchaseComponent purchaseComponent) {
        super(purchaseComponent);
    }

    @Override
    public void show() {
        super.show();
        System.out.println(" - Menambahkan fitur sorting pada riwayat pembelian.");
    }
}

public class FilteringDecorator extends Decorator {
    public FilteringDecorator(PurchaseComponent purchaseComponent) {
        super(purchaseComponent);
    }

    @Override
    public void show() {
        super.show();
        System.out.println(" - Menambahkan fitur filter pada riwayat pembelian.");
    }
}
