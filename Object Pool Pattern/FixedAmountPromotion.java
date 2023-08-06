public class FixedAmountPromotion implements Promotion {
    private double amount;
    private boolean isApplied;

    public FixedAmountPromotion(double amount) {
        this.amount = amount;
    }

    @Override
    public void applyPromotion() {
        System.out.println("Applying Fixed Amount Promotion: -$" + amount);
        isApplied = true;
    }

    @Override
    public void reset() {
        isApplied = false;
    }
}

public class PercentagePromotion implements Promotion {
    private double percentage;
    private boolean isApplied;

    public PercentagePromotion(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public void applyPromotion() {
        System.out.println("Applying Percentage Promotion: -" + percentage + "%");
        isApplied = true;
    }

    @Override
    public void reset() {
        isApplied = false;
    }
}
