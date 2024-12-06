package org.example;

import java.util.ArrayList;
import java.util.List;

public class RentalService {
    private List<Vehicle> vehicles;

    //Konstruktor för att skapa en lista och lägga in fordon
   public RentalService(){
       vehicles = new ArrayList<>();

       //Lägger in fordon i listan
       vehicles.add(new Car("Volvo V40", "TRF749",700));
       vehicles.add(new SUV("Mercedes-Benz GLC","WFJ025",1000 ));
       vehicles.add(new Truck("Dodge RAM","SHA443",1750));
       vehicles.add(new Convertible("Audi A5 Cabriolet","ESG059",1900));
   }

   //Visar alla tillgängliga fordon
   public void displayVehicles(){
       System.out.println("Tillgängliga fordon:");
       for (int i = 0; i < vehicles.size(); i++){
           Vehicle vehicle = vehicles.get(i);

           //Visar fordonets detaljer
           System.out.println((i + 1) +
                   " . " + vehicle.getVehicleType() +
                   " - " + vehicle.model +
                   " (" + vehicle.registrationNumber +
                   ") - Pris per dag: " + vehicle.rentalPricePerDay +
                   " kr " + (vehicle.isRented ? " [EJ TILLGÄNGLIG] " : ""));
       }
   }

   //Hyra ett fordon
   public void rentVehicle(int index){
       Vehicle vehicle = vehicles.get(index - 1); //Välj ett fordon från listan
       if (vehicle.isRented){
           System.out.println("Detta fordonet är uthyrd");//Om fordonet redan är uthyrd
       }else{
           vehicle.isRented = true;
           System.out.println("Du har hyrt " + vehicle.model);//När du hyrt fordonet
       }
   }

   //Lämna tillbaka fordon
   public void returnVehicle(int index, int rentalDays ){
       Vehicle vehicle = vehicles.get(index - 1);
       if (!vehicle.isRented){
           System.out.println("Detta fordon var ej hyrt");
       }else{
           vehicle.isRented = false;
           double cost = vehicle.rentalPricePerDay * rentalDays;
           System.out.println("Du har lämnat tillbaka: " + vehicle.model);
           System.out.println("Den totala kostnaden " + rentalDays + " dagar: " + cost + " kr ");
       }
   }
}
