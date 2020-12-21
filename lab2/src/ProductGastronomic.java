import java.io.Serializable;

public class ProductGastronomic extends Product implements Serializable {

    public ProductGastronomic(String article, String name, String productionDate, int shelfLife, int storageTemperature, double price, ProductModel model) {
        super(article, name, productionDate, shelfLife, storageTemperature, price, model);
    }
}
