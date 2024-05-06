public class CheetosDispenser extends SnackDispenseHandler {
    @Override
    public void processRequest(String productName, double moneyInserted) {
        if ("Cheetos".equalsIgnoreCase(productName)) {
            System.out.println("Checking if Cheetos can be dispensed...");
            System.out.println("Cheetos is being dispensed...");
        } else if (successor != null) {
            successor.processRequest(productName, moneyInserted);
        }
    }
}
