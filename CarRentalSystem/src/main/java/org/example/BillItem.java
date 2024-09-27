package org.example;

public class BillItem {
    private double amount;

    private String service;

    private BillItemType billItemType;

    public BillItem(double amount, String service, BillItemType billItemType) {
        this.amount = amount;
        this.service = service;
        this.billItemType = billItemType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public BillItemType getBillItemType(){
        return billItemType;
    }
}
