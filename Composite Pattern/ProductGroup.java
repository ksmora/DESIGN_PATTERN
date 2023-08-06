import java.util.ArrayList;
import java.util.List;

public class ProductGroup implements StockItem {
    private String name;
    private List<StockItem> items;

    public ProductGroup(String name) {
        this.name = name;
        items = new ArrayList<>();
    }

    public void add(StockItem item) {
        items.add(item);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getStock() {
        int totalStock = 0;
        for (StockItem item : items) {
            totalStock += item.getStock();
        }
        return totalStock;
    }

    @Override
    public void updateStock(int quantity) {
        for (StockItem item : items) {
            item.updateStock(quantity);
        }
    }
}
