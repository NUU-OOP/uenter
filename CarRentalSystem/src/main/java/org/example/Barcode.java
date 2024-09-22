package org.example;

import java.util.Date;

public class Barcode {
    String barcode;
    Date issuedAt;
    boolean active;

    public Barcode(String barcode, Date issuedAt, boolean active) {
        this.barcode = barcode;
        this.issuedAt = issuedAt;
        this.active = active;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Date getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(Date issuedAt) {
        this.issuedAt = issuedAt;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void isActive(boolean active){

    }

}
