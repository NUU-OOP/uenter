package org.example;

public class AdditionalDriver {
    private String driverId;
    private Person person;

    public AdditionalDriver(String driverId, Person person) {
        this.driverId = driverId;
        this.person = person;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
