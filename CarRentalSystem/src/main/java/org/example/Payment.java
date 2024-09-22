package org.example;

import java.util.Date;

public class Payment {
    private Date creationDate;
    private double amount;
    private PaymentStatus status;

    public boolean initiateTransaction(){
        return false;
    }

}
