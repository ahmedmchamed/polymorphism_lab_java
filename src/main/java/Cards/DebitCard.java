package Cards;

public class DebitCard extends PaymentCard {

    private int sortCode;
    private int accountNumber;


    public DebitCard(int cardNumber, String expiryDate, int securityNumber, int sortCode, int accountNumber) {
        super(cardNumber, expiryDate, securityNumber);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    public double getTransactionCost(double purchaseAmount) {
        return 0.01 * purchaseAmount;
    }

    public void charge(double purchaseAmount) {}

    public int getSortCode() {
        return this.sortCode;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
}
