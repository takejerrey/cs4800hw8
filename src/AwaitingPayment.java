import java.util.*;
public class AwaitingPayment implements StateOfVendingMachine {
    private VendingMachine vending;

    public AwaitingPayment(VendingMachine vending) {
        this.vending = vending;
    }

    @Override
    public void selectProduct(String productName) {
        System.out.println("A product has already been selected. Please insert the required money.");
    }

    @Override
    public void inputMoney(double money) {
        double requiredMoney = vending.products.get(vending.getCurrentProduct()).getPrice();
        if (money >= requiredMoney) {
            vending.setMoneyReceived(money);
            vending.changeState(vending.getDispensingProductState());
            vending.dispenseProduct();
        } else {
            System.out.println("Insufficient money inserted.");
        }
    }

    @Override
    public void releaseProduct() {
    }
}


