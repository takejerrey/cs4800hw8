public class Idle implements StateOfVendingMachine {
    private VendingMachine vending;

    public Idle(VendingMachine vending) {
        this.vending = vending;
    }

    @Override
    public void selectProduct(String productName) {
        vending.setCurrentProduct(productName);
        vending.changeState(vending.getAwaitingPaymentState());
    }

    @Override
    public void inputMoney(double money) {
        System.out.println("Please choose a product first.");
    }

    @Override
    public void releaseProduct() {
        // Nothing happens in Idle state
    }
}
