package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Member extends Account{
    private String driverLicenseNumber;
    private Date driverLicenseExpiry;
    public List<VehicleReservation> getReservation(){
        return new ArrayList<>();
    }
}