package Cards;

import java.util.Calendar;

public class CreditCard extends PaymentCard  {

    private double riskMultiplier;

    public CreditCard(double cardCost, String cardType, int cardNumber, String expirationDate, double riskMultiplier){
        super(cardCost, cardType, cardNumber, expirationDate);
        this.riskMultiplier = riskMultiplier;
    }

    public double getRiskMultiplier() {
        return riskMultiplier;
    }
}
