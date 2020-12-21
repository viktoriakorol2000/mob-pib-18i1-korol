import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Order implements Serializable {
    private static int NEXT_NUMBER = 1;

    private int number;
    private Consumer consumer;
    private List<Product> listOrderProduct = new ArrayList<>();
    private double sumOrder;

    public Order(Consumer consumer, List<Product> listOrderProduct, double sumOrder) {
        this.number = NEXT_NUMBER++;
        this.consumer = consumer;
        this.listOrderProduct = listOrderProduct;
        this.sumOrder = sumOrder;
    }

    @Override
    public String toString() {
        return "Order{" +
                "number=" + number +
                ", consumer=" + consumer +
                ", listOrderProduct=" + listOrderProduct +
                ", sumOrder=" + sumOrder +
                '}';
    }
}

