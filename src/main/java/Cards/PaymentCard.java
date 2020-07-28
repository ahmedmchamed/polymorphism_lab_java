package Cards;

import Retailers.IChargeable;

import java.util.ArrayList;

public abstract class PaymentCard implements IChargeable {

    protected int cardNumber;
    protected String expiryDate;
    protected int securityNumber;
    protected ArrayList<Double> charges;

    public PaymentCard(int cardNumber, String expiryDate, int securityNumber) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
        this.charges = new ArrayList<Double>();
    }

    public int getCardNumber() {
        return this.cardNumber;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public int getSecurityNumber() {
        return this.securityNumber;
    }

    public ArrayList<Double> getCharges() {
        return this.charges;
    }

    public void addToListOfCharges(double purchaseAmount) {
        this.charges.add(purchaseAmount);
    }

}
