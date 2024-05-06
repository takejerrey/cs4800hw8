public class PepsiDispenser extends SnackDispenseHandler {
    @Override
    public void processRequest(String productName, double moneyInserted) {
        if ("Pepsi".equalsIgnoreCase(productName)) {
            System.out.println("Checking if Pepsi can be dispensed...");
            System.out.println("Pepsi is being dispensed...");
        } else if (successor != null) {
            successor.processRequest(productName, moneyInserted);
        }
    }
}
