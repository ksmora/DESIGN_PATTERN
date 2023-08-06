public class ConcreteProduct implements Product {
    private String name;
    private String brand;
    private String category;
    private double price;

    public ConcreteProduct(String name, String brand, String category, double price) {
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("Product: " + name + ", Brand: " + brand + ", Category: " + category + ", Price: " + price);
    }
}
