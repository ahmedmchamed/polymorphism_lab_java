package Retailers;

import java.util.ArrayList;

public class ReportingSoftware {

    private ArrayList<Double> transactionCosts;

    public ReportingSoftware() {
        this.transactionCosts = new ArrayList<Double>();
    }

    public ArrayList<Double> getTransactionCostsList() {
        return this.transactionCosts;
    }

    public void addCostToList(double cost) {
        this.transactionCosts.add(cost);
    }

}
