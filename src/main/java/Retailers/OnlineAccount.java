package Retailers;

import java.util.ArrayList;

public class OnlineAccount {

    private String name;
    private ArrayList<IChargeable> paymentMethods;
    private ReportingSoftware reportingSoftware;

    public OnlineAccount(String name, ReportingSoftware reportingSoftware) {
        this.name = name;
        this.paymentMethods = new ArrayList<IChargeable>();
        this.reportingSoftware = reportingSoftware;
    }

    public void chargeCustomer(IChargeable paymentMethod, double transaction) {
        this.paymentMethods.add(paymentMethod);
        double chargeAmount = paymentMethod.getTransactionCost(transaction);
        this.reportingSoftware.addCostToList(chargeAmount);
        paymentMethod.charge(transaction);
    }

    public ArrayList<IChargeable> getPaymentMethods() {
        return this.paymentMethods;
    }

    public String getName() {
        return this.name;
    }
}
