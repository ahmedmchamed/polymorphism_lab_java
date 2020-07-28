package Cards;

import Retailers.IChargeable;

public class GiftCard implements IChargeable {

    private String vendor;
    private double balance;

    public GiftCard(String vendor, double balance) {
        this.vendor = vendor;
        this.balance = balance;
    }

    public double getTransactionCost(double transactionAmount) {
        return 0 * transactionAmount;
    }

    public void charge(double transactionAmount) {
        this.balance -= transactionAmount;
    }

    public String getVendor() {
        return vendor;
    }

    public double getBalance() {
        return balance;
    }
}
