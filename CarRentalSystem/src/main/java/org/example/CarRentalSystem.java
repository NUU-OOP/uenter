package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarRentalSystem {
    private String name;
    private List<CarRentalLocation> carRentalLocations = new ArrayList<>();
    public boolean addNewLocation(CarRentalLocation location){
        carRentalLocations.add(location);
        return true;
    }
}
