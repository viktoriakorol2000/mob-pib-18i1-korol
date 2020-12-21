import java.io.Serializable;

public class Product implements Serializable {
    private String article;
    private String name;
    private String productionDate;
    private int shelfLife;
    private int storageTemperature;
    private double price;
    private final ProductModel model;

    public Product(String article, String name, String productionDate, int shelfLife, int storageTemperature, double price, ProductModel model) {
        this.article = article;
        this.name = name;
        this.productionDate = productionDate;
        this.shelfLife = shelfLife;
        this.storageTemperature = storageTemperature;
        this.price = price;
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "article='" + article + '\'' +
                ", name='" + name + '\'' +
                ", productionDate=" + productionDate +
                ", shelfLife=" + shelfLife +
                ", storageTemperature=" + storageTemperature +
                ", price=" + price +
                '}';
    }
}
