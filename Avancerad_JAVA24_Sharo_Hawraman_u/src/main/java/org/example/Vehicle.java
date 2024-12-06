package org.example;


// Bas klasser
abstract class Vehicle {
    protected String model;
    protected String registrationNumber;
    protected double rentalPricePerDay;
    protected boolean isRented;

    //konstruktor
    public Vehicle(String model, String registrationNumber, double rentalPricePerDay) {
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.rentalPricePerDay = rentalPricePerDay;
        this.isRented = false;
    }


    //Metod för att implementera fordon typ.
    public abstract String getVehicleType();
}