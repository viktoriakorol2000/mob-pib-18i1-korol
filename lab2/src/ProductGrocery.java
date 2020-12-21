import java.io.Serializable;

public class ProductGrocery extends Product implements Serializable {

    public ProductGrocery(String article, String name, String productionDate, int shelfLife, int storageTemperature, double price, ProductModel model) {
        super(article, name, productionDate, shelfLife, storageTemperature, price, model);
    }
}
