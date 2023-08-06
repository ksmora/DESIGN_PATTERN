import java.util.ArrayList;
import java.util.List;

public class PromotionPool {
    private static final int MAX_POOL_SIZE = 10;
    private List<Promotion> pool;

    public PromotionPool() {
        pool = new ArrayList<>();
        initializePool();
    }

    private void initializePool() {
        for (int i = 0; i < MAX_POOL_SIZE; i++) {
            pool.add(new FixedAmountPromotion(50.0)); // Contoh inisialisasi pool dengan FixedAmountPromotion
        }
    }

    public Promotion getPromotion() {
        for (Promotion promotion : pool) {
            if (!promotion.isApplied()) {
                return promotion;
            }
        }
        return null;
    }
}
