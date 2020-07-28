package Retailers;

import Cards.CreditCard;

import java.util.ArrayList;

public class OnlineAccount {

    private ArrayList<IChargeable> paymentMethods;
    private ReportingSoftware reportSoftware;
    private String name;

    public OnlineAccount(String name){
        this.name = name;
        this.paymentMethods = new ArrayList<IChargeable>();
        this.reportSoftware = new ReportingSoftware();
    }



}
