package org.example;


interface Rentable {
    void rentVehicle(); //Metod för att hyra fordon
    void returnVehicle();//Metod för att lämna tilbaka fordon
    double calculatingRentalCost(int rentalDays);//Metod för att beräkna kostnaden
}
