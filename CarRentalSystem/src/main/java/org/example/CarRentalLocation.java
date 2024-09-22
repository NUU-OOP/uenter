package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarRentalLocation {
    private String name;
    private Location location;
    private List<Vehicle> vehicleList= new ArrayList<>();

    public CarRentalLocation(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    public void addCar(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }
}
