package org.example;

//Ärver från Vehicle
public class Convertible extends Vehicle{

    public Convertible(String model, String registrationNumber, double rentalPricePerDay) {
        super(model, registrationNumber, rentalPricePerDay);

    }

    @Override
    public String getVehicleType() {
        return "Convertible";
    }
}
