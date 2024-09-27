package org.example;

import java.util.List;

public class Bill {
    private double totalAmount;
    private List<BillItem> billItems;

    public Bill(double totalAmount, List<BillItem> billItems) {
        this.totalAmount = totalAmount;
        this.billItems = billItems;
    }


}
