public class CokeDispenser extends SnackDispenseHandler {
    @Override
    public void processRequest(String productName, double moneyInserted) {
        if (productName.equalsIgnoreCase("Coke")) {
            System.out.println("Coke is being dispensed");
        } else if (successor != null) {
            successor.processRequest(productName, moneyInserted);
        }
    }
}
