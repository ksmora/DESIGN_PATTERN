public abstract class Decorator implements PurchaseComponent {
    protected PurchaseComponent purchaseComponent;

    public Decorator(PurchaseComponent purchaseComponent) {
        this.purchaseComponent = purchaseComponent;
    }

    @Override
    public void show() {
        purchaseComponent.show();
    }
}
