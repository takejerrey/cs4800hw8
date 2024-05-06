public class Snack {
    private String snackName;
    private double snackPrice;
    private int snackQuantity;

    public Snack(String name, double price, int quantity) {
        this.snackName = name;
        this.snackPrice = price;
        this.snackQuantity = quantity;
    }

    public String getName() { return snackName; }
    public double getPrice() { return snackPrice; }
    public int getQuantity() { return snackQuantity; }
    public void setQuantity(int quantity) { this.snackQuantity = quantity; }
}
