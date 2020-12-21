import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        if (ShopD.isFileExists()) {
            Shop shop = ShopD.readShop();
            for (Sales sale : shop.getSales()) {
                System.out.println("Продукт со скидкой: " + sale);
            }
            for (Order order : shop.getOrders()) {
                System.out.println("Заказ: " + order);
            }
        } else {
            System.out.println("!Магазин!");
            Shop shop = new Shop();
            ProductGastronomic product1 = new ProductGastronomic("1", "Творог", "2020.11.15", 10, 2, 120, ProductModel.MILKY);
            ProductGrocery product2 = new ProductGrocery("2", "Гречка", "2020.11.15", 180, 20, 30, ProductModel.GRAINS);

            Consumer consumer1 = new Consumer("Виктория", "Король", "743487", "vika.korol@gmail.com", 1200, 0);
            Consumer consumer2 = new Consumer("Павел", "Олейник", "543684", "pavel.oleinik@gmail.com", 12000, 5);
            System.out.println("Покупатели:");
            System.out.println(consumer1.toString());
            System.out.println(consumer2.toString());
            System.out.println("Продукты:");
            System.out.println(product1.toString());
            System.out.println(product2.toString());

            shop.addSale(product1, 5, "2020.11.13", "2020.11.20");
            shop.addSale(product2, 10, "2020.11.13", "2020.13.20");

            for (Sales sale : shop.getSales()) {
                System.out.println("Продукт со скидкой: " + sale);
            }
            List<Product> listOrderProduct = new ArrayList<>();
            listOrderProduct.add(product1);
            listOrderProduct.add(product1);
            listOrderProduct.add(product2);

            shop.sellOutOrder(consumer1, listOrderProduct);
            for (Order order : shop.getOrders()) {
                System.out.println("Заказ: " + order);
            }
            ShopD.writeShop(shop);
        }
    }
}
