package org.example;




import java.time.LocalDate;


public class VehicleReservation {

    private String reservationNumber;
    private LocalDate creationDate;
    private LocalDate returnDate;
    private String pickupLocationName;
    private String returnLocationName;
    private LocalDate dueDate;
    private Bill bill;


    public VehicleReservation(String reservationNumber, LocalDate creationDate, LocalDate returnDate, String pickupLocationName, String returnLocationName, LocalDate dueDate) {
        this.reservationNumber = reservationNumber;
        this.creationDate = creationDate;
        this.returnDate = returnDate;
        this.pickupLocationName = pickupLocationName;
        this.returnLocationName = returnLocationName;
        this.dueDate = dueDate;
    }

    public String getReservationNumber() {
        return reservationNumber;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public String getPickupLocationName() {
        return pickupLocationName;
    }

    public String getReturnLocationName() {
        return returnLocationName;
    }



    public void fetchDetails(String reservationNumber) {
        if (this.reservationNumber.equals(reservationNumber)) {
            System.out.println("Reservation Number: " + getReservationNumber() +
                    "\nCreation Date: " + getCreationDate() +
                    "\nDue Date: " + getDueDate() +
                    "\nReturn Date: " + getReturnDate() +
                    "\nPickup Location: " + getPickupLocationName() +
                    "\nReturn Location: " + getReturnLocationName());

        } else {
            System.out.println("Reservation number not found.");
        }
    }
}
