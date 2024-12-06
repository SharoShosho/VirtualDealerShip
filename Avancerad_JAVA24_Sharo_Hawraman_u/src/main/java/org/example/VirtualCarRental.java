package org.example;

import java.util.Scanner;

//Klass för uthyrnings tjänsten
public class VirtualCarRental {
    public static void main(String[] args) {
        RentalService rentalService = new RentalService();
        Scanner scanner = new Scanner(System.in);

        //Loop för att visa meny samt ta emot inmatningar
        while (true){
            System.out.println("\n--- Virtuell bil uthyrning ---");
            System.out.println("1. Visa tillgängliga bilar");
            System.out.println("2. Hyra fordon");
            System.out.println("3. Återlämning av fordon");
            System.out.println("4. Exit");
            System.out.println("Välj ett alternativ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    rentalService.displayVehicles();//Visar alla fordon
                    break;

                case 2:
                    System.out.println("Ange nummer för val av fordon att hyra: ");
                    int rentIndex = scanner.nextInt();
                    rentalService.rentVehicle(rentIndex);//Hyra fordon
                    break;

                case 3:
                    System.out.println(" Ange nummer för val av fordon att lämna in: ");
                    int returnIndex = scanner.nextInt();
                    System.out.println("Ange dagar av dagar uthyrd: ");
                    int rentalDays = scanner.nextInt();
                    rentalService.returnVehicle(returnIndex, rentalDays);//Lämna tillbaka fordon
                    break;
                case 4:
                    System.out.println("Tack för du använde den Virtuella biluthyrningen!");
                    scanner.close();//Sänger scanner
                    return;
                default:
                    System.out.println("Ogiltig alternativ. Vänligen försök igen. ");//Felsökning
            }
        }
    }
}
