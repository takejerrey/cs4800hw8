public class DoritosDispenser extends SnackDispenseHandler {
    @Override
    public void processRequest(String productName, double moneyInserted) {
        if ("Doritos".equalsIgnoreCase(productName)) {
            System.out.println("Checking if Doritos can be dispensed...");
            System.out.println("Doritos is being dispensed...");
        } else if (successor != null) {
            successor.processRequest(productName, moneyInserted);
        }
    }
}
