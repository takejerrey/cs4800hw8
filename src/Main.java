public class Main {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        SnackDispenseHandler cokeHandler = new CokeDispenser();
        SnackDispenseHandler pepsiHandler = new PepsiDispenser();
        SnackDispenseHandler cheetosHandler = new CheetosDispenser();
        SnackDispenseHandler doritosHandler = new DoritosDispenser();
        SnackDispenseHandler kitKatHandler = new KitKatDispenser();
        SnackDispenseHandler snickersHandler = new SnickersDispenser();

        cokeHandler.setSuccessor(pepsiHandler);
        pepsiHandler.setSuccessor(cheetosHandler);
        cheetosHandler.setSuccessor(doritosHandler);
        doritosHandler.setSuccessor(kitKatHandler);
        kitKatHandler.setSuccessor(snickersHandler);

        vendingMachine.setSnackHandler(cokeHandler);

        System.out.println("Transaction log:");

        attemptPurchase(vendingMachine, "Coke", 1.50);
        attemptPurchase(vendingMachine, "Coke", 1.50);
        attemptPurchase(vendingMachine, "Coke", 1.50);

        attemptPurchase(vendingMachine, "Pepsi", 1.50);

        attemptPurchase(vendingMachine, "Snickers", 1.50);
        attemptPurchase(vendingMachine, "Snickers", 1.50);
        attemptPurchase(vendingMachine, "Snickers", 1.50);

        attemptPurchase(vendingMachine, "Doritos", 1.00);

        attemptPurchase(vendingMachine, "KitKat", 0.75);

        attemptPurchase(vendingMachine, "KitKat", 1.25);
    }

    private static void attemptPurchase(VendingMachine vendingMachine, String snackName, double money) {
        System.out.println("\nAttempting to purchase " + snackName + " with $" + money);
        vendingMachine.chooseProduct(snackName);
        vendingMachine.addMoney(money);
        vendingMachine.dispenseProduct();
    }
}