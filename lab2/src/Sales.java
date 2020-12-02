public class Sales {
    private Product product;
    private int discount;
    private String dateStart;
    private String dateEnd;

    public Sales(Product product, int discount, String dateStart, String dateEnd) {
        this.product = product;
        this.discount = discount;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "product=" + product +
                ", discount=" + discount +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                '}';
    }
}
