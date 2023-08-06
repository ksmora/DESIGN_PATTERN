public class EcommerceApp {
    public static void main(String[] args) {
        PromotionPool promotionPool = new PromotionPool();

        // Mendapatkan objek Diskon dari pool
        Promotion promotion1 = promotionPool.getPromotion();
        if (promotion1 != null) {
            promotion1.applyPromotion();
        }

        // Mendapatkan objek Diskon lainnya dari pool
        Promotion promotion2 = promotionPool.getPromotion();
        if (promotion2 != null) {
            promotion2.applyPromotion();
        }

        // Reset objek Diskon pertama dan kembalikan ke pool
        if (promotion1 != null) {
            promotion1.reset();
        }

        // Mendapatkan objek Diskon yang telah di-reset dari pool
        Promotion promotion3 = promotionPool.getPromotion();
        if (promotion3 != null) {
            promotion3.applyPromotion();
        }
    }
}

// Applying Fixed Amount Promotion: -$50.0
// Applying Fixed Amount Promotion: -$50.0
// Applying Fixed Amount Promotion: -$50.0