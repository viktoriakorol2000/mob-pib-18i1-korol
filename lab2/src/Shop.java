import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Order> orders = new ArrayList<>();
    private List<Sales> sales = new ArrayList<>();

    public Order sellOutOrder(Consumer consumer, List<Product> listOrderProduct) {
        double sumOrder = 0;
        for (Product product : listOrderProduct) {
            sumOrder += product.getPrice();
        }
        Order order = new Order(consumer, listOrderProduct, sumOrder);
        orders.add(order);
        return order;
    }

    public Sales addSale(Product product, int discount, String dateStart, String dateEnd) {
        Sales sale = new Sales(product, discount, dateStart, dateEnd);
        sales.add(sale);
        return sale;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<Sales> getSales() {
        return sales;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "orders=" + orders +
                ", sales=" + sales +
                '}';
    }
}
