package Cards;

public class CreditCard extends PaymentCard {

    private double customerRiskMultiplier;
    private double creditLimit;


    public CreditCard(int cardNumber, String expiryDate, int securityNumber, double creditLimit) {
        super(cardNumber, expiryDate, securityNumber);
        this.customerRiskMultiplier = 0.05;
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public double getTransactionCost(double purchaseAmount) {
        return 0.02 * purchaseAmount;
    }

    public void charge(double purchaseAmount) {
        this.addToListOfCharges(purchaseAmount);
        this.creditLimit -= purchaseAmount;
    }

}
