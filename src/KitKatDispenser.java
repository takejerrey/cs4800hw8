public class KitKatDispenser extends SnackDispenseHandler {
    @Override
    public void processRequest(String productName, double moneyInserted) {
        if ("KitKat".equalsIgnoreCase(productName)) {
            System.out.println("Checking if KitKat can be dispensed...");
            System.out.println("KitKat is being dispensed...");
        } else if (successor != null) {
            successor.processRequest(productName, moneyInserted);
        }
    }
}
