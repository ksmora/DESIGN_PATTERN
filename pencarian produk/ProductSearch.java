public class ProductSearch {
    private List<Product> products;
    private SearchFilter filterChain;

    public ProductSearch(List<Product> products) {
        this.products = products;
        buildFilterChain();
    }

    private void buildFilterChain() {
        filterChain = new NameFilter();
        SearchFilter categoryFilter = new CategoryFilter();
        SearchFilter priceFilter = new PriceFilter();

        filterChain.setNextFilter(categoryFilter);
        categoryFilter.setNextFilter(priceFilter);
    }

    public List<Product> search(String keyword) {
        return filterChain.applyFilter(products, keyword);
    }
}
