/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

class RoadAccident {
    private String city;
    private int carAccidents;
    private int motorbikeAccidents;

    public RoadAccident(String city, int carAccidents, int motorbikeAccidents) {
        this.city = city;
        this.carAccidents = carAccidents;
        this.motorbikeAccidents = motorbikeAccidents;
    }

    public String getCity() {
        return city;
    }

    public int getCarAccidents() {
        return carAccidents;
    }

    public int getMotorbikeAccidents() {
        return motorbikeAccidents;
    }

    @Override
    public String toString() {
        return city + " | Cars: " + carAccidents + " | Motorbikes: " + motorbikeAccidents;
    }
}
/**
 *
 * @author Keenan
 */
public class AccidentProgram {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store road accidents for three cities
        RoadAccident[] accidents = new RoadAccident[3];

        System.out.println("Enter road accident data for 3 cities.");

        // Collecting data from the user
        for (int i = 0; i < accidents.length; i++) {
            System.out.println("Enter city name:");
            String city = scanner.nextLine();
            System.out.println("Enter the number of car accidents in " + city + ":");
            int carAccidents = scanner.nextInt();
            System.out.println("Enter the number of motorbike accidents in " + city + ":");
            int motorbikeAccidents = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            // Store the accident data for the city
            accidents[i] = new RoadAccident(city, carAccidents, motorbikeAccidents);
        }

        // Display the report
        System.out.println("\nRoad Accident Report:");
        System.out.println("City | Car Accidents | Motorbike Accidents");
        for (RoadAccident accident : accidents) {
            System.out.println(accident);
        }

        // Calculate and display total accidents for cars and motorbikes
        int totalCarAccidents = 0;
        int totalMotorbikeAccidents = 0;
        for (RoadAccident accident : accidents) {
            totalCarAccidents += accident.getCarAccidents();
            totalMotorbikeAccidents += accident.getMotorbikeAccidents();
        }

        System.out.println("\nTotal Car Accidents: " + totalCarAccidents);
        System.out.println("Total Motorbike Accidents: " + totalMotorbikeAccidents);

        scanner.close();
    }
}

