public class SnickersDispenser extends SnackDispenseHandler {
    @Override
    public void processRequest(String productName, double moneyInserted) {
        if ("Snickers".equalsIgnoreCase(productName)) {
            System.out.println("Checking if Snickers can be dispensed...");
            System.out.println("Snickers is being dispensed...");
        } else if (successor != null) {
            successor.processRequest(productName, moneyInserted);
        }
    }
}
