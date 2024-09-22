package org.example;



import java.sql.Timestamp;
import java.util.Date;

public class VehicleReservation {

    private String reservationNumber;
    private Date creationDate;
    private enum ReservationStatus{
        ACTIVE, ENDED
    }
    private Timestamp returnDate;

    private String pickupLocationName;
    private String returnLocationName;


    private Timestamp dueDate;

    public VehicleReservation(String reservationNumber, Date creationDate, Timestamp returnDate, String pickupLocationName, String returnLocationName, Timestamp dueDate) {
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

    public Date getCreationDate() {
        return creationDate;
    }

    public Timestamp getDueDate() {
        return dueDate;
    }

    public Timestamp getReturnDate() {
        return returnDate;
    }

    public String getPickupLocationName() {
        return pickupLocationName;
    }

    public String getReturnLocationName() {
        return returnLocationName;
    }



    public static void fetchDetails(){
//        System.out.println("Reservation Number: "+ getReservationNumber()+ "Creation Date" + getCreationDate()+ "Due Date"+ getDueDate()+ "Return Date"+ getReturnDate()+"Pickup Location" + getPickupLocationName() + "Return location "+ getReturnLocationName());
    }
}
