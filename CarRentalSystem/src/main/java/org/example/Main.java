package org.example;

public class Main {
    public static void main(String[] args) {
        Vehicle gentra = new Vehicle("01T333AB");
        Vehicle vehicle1 = new Vehicle("01T333AB");
        Vehicle vehicle2 = new Vehicle("02T444BC");
        Vehicle vehicle3 = new Vehicle("03T555CD");
        Vehicle vehicle4 = new Vehicle("04T666DE");
        Vehicle vehicle5 = new Vehicle("05T777EF");
        Vehicle vehicle6 = new Vehicle("06T888FG");
        Vehicle vehicle7 = new Vehicle("07T999GH");
        Vehicle vehicle8 = new Vehicle("08T000HI");
        Vehicle vehicle9 = new Vehicle("09T111IJ");
        Vehicle vehicle10 = new Vehicle("10T222JK");
        Location location = new Location("Amir Temur 3", "Tashkent sh,", "Tashkent","100002","Uzbekistan");
        CarRentalLocation yunusobod = new CarRentalLocation("Yunusobod filial",location);
        CarRentalLocation yakkasaroy = new CarRentalLocation("Yakkasaroy", location);
        yunusobod.addCar(gentra);
        yunusobod.addCar(vehicle1);
        yunusobod.addCar(vehicle2);
        yunusobod.addCar(vehicle3);
        yunusobod.addCar(vehicle4);
        yakkasaroy.addCar(vehicle5);
        yakkasaroy.addCar(vehicle6);
        yakkasaroy.addCar(vehicle7);
        yakkasaroy.addCar(vehicle8);
        yakkasaroy.addCar(vehicle9);
        yakkasaroy.addCar(vehicle10);
        CarRentalSystem carRentalSystem = new CarRentalSystem();

        carRentalSystem.addNewLocation(yunusobod);
        carRentalSystem.addNewLocation(yakkasaroy);




    }
}
