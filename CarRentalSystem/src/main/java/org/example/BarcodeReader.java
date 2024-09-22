package org.example;

import java.util.Date;

public class BarcodeReader extends Barcode {

    String id;
    Date registeredAt;
    boolean active;

    public BarcodeReader(String barcode, Date issuedAt, boolean active, String id, Date registeredAt, boolean active1) {
        super(barcode, issuedAt, active);
        this.id = id;
        this.registeredAt = registeredAt;
        this.active = active1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(Date registeredAt) {
        this.registeredAt = registeredAt;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public void setActive(boolean active) {
        this.active = active;
    }

    public void isActive(boolean active){

    }
}
