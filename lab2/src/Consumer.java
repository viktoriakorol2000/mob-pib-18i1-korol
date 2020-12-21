import java.io.Serializable;

public class Consumer implements Serializable {
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private double sumPurchases;
    private int discount;

    public Consumer(String name, String surname, String phoneNumber, String email, double sumPurchases, int discount) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.sumPurchases = sumPurchases;
        this.discount = discount;
    }


    @Override
    public String toString() {
        return "Consumer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", sumPurchases=" + sumPurchases +
                ", discount=" + discount +
                '}';
    }
}
