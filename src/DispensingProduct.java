import java.util.*;
public class DispensingProduct implements StateOfVendingMachine {
    private VendingMachine vending;

    public DispensingProduct(VendingMachine vending) {
        this.vending = vending;
    }

    @Override
    public void selectProduct(String productName) {
        System.out.println("Please wait, currently dispensing a product.");
    }

    @Override
    public void inputMoney(double money) {
        System.out.println("Please wait, currently dispensing a product.");
    }

    @Override
    public void releaseProduct() {
        Snack snack = vending.products.get(vending.getCurrentProduct());
        if (snack.getQuantity() > 0) {
            snack.setQuantity(snack.getQuantity() - 1);
            System.out.println(snack.getName() + " dispensed.");
            vending.setMoneyReceived(0);
            vending.setCurrentProduct(null);
            vending.changeState(vending.getIdleState());
        } else {
            System.out.println("Sorry, " + snack.getName() + " is out of stock.");
            vending.changeState(vending.getIdleState());
        }
    }
}