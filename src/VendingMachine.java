import java.util.*;
public class VendingMachine {
    private StateOfVendingMachine currentState;
    private StateOfVendingMachine idle;
    private StateOfVendingMachine awaitingPayment;
    private StateOfVendingMachine dispensingProduct;
    private SnackDispenseHandler handler;

    Map<String, Snack> products = new HashMap<>();
    private double moneyReceived = 0;
    private String currentProduct = null;

    public VendingMachine() {
        idle = new Idle(this);
        awaitingPayment = new AwaitingPayment(this);
        dispensingProduct = new DispensingProduct(this);

        currentState = idle;

        products.put("Coke", new Snack("Coke", 1.50, 10));
        products.put("Pepsi", new Snack("Pepsi", 1.50, 10));
        products.put("Cheetos", new Snack("Cheetos", 1.00, 15));
        products.put("Doritos", new Snack("Doritos", 1.00, 15));
        products.put("KitKat", new Snack("KitKat", 1.25, 20));
        products.put("Snickers", new Snack("Snickers", 1.25, 20));
    }

    public void changeState(StateOfVendingMachine newState) {
        currentState = newState;
    }

    public void chooseProduct(String productName) {
        currentState.selectProduct(productName);
    }

    public void addMoney(double money) {
        currentState.inputMoney(money);
    }

    public void dispenseProduct() {
        currentState.releaseProduct();
    }

    public StateOfVendingMachine getIdleState() {
        return idle;
    }

    public StateOfVendingMachine getAwaitingPaymentState() {
        return awaitingPayment;
    }

    public StateOfVendingMachine getDispensingProductState() {
        return dispensingProduct;
    }

    public String getCurrentProduct() {
        return currentProduct;
    }

    public void setCurrentProduct(String currentProduct) {
        this.currentProduct = currentProduct;
    }

    public double getMoneyReceived() {
        return moneyReceived;
    }

    public void setMoneyReceived(double moneyReceived) {
        this.moneyReceived = moneyReceived;
    }
    public void setSnackHandler(SnackDispenseHandler handler) {
        this.handler = handler;
    }

}
