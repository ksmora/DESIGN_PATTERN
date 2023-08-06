public abstract class SearchFilter {
    protected SearchFilter nextFilter;

    public void setNextFilter(SearchFilter nextFilter) {
        this.nextFilter = nextFilter;
    }

    public abstract List<Product> applyFilter(List<Product> products, String keyword);
}
