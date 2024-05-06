public abstract class SnackDispenseHandler {
    protected SnackDispenseHandler successor;

    public void setSuccessor(SnackDispenseHandler successor) {
        this.successor = successor;
    }

    public abstract void processRequest(String productName, double moneyInserted);
}
