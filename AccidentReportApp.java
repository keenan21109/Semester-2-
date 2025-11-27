/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Define the interface
public interface IRoadAccidents {
    String getAccidentVehicleType();
    String getCity();
    int getAccidentTotal();
}

// Abstract class for RoadAccidents
abstract class RoadAccidents implements IRoadAccidents {
    protected String vehicleType;
    protected String city;
    protected int totalAccidents;

    public RoadAccidents(String vehicleType, String city, int totalAccidents) {
        this.vehicleType = vehicleType;
        this.city = city;
        this.totalAccidents = totalAccidents;
    }

    @Override
    public String getAccidentVehicleType() {
        return vehicleType;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public int getAccidentTotal() {
        return totalAccidents;
    }

    // Abstract method to print the accident report
    public abstract void printAccidentReport();
}

// Subclass RoadAccidentReport
class RoadAccidentReport extends RoadAccidents {

    public RoadAccidentReport(String vehicleType, String city, int totalAccidents) {
        super(vehicleType, city, totalAccidents);
    }

    // Implement the abstract method to print the report
    @Override
    public void printAccidentReport() {
        System.out.println("Vehicle Type: " + getAccidentVehicleType());
        System.out.println("City: " + getCity());
        System.out.println("Total Accidents: " + getAccidentTotal());
        System.out.println("----------------------------------");
    }
}

// Main class to execute the program
public class AccidentReportApp {
	public static void main(String[] args) {
        // Create some sample accident reports
        RoadAccidentReport report1 = new RoadAccidentReport("Car", "Cape Town", 155);
        RoadAccidentReport report2 = new RoadAccidentReport("Motorbike", "Cape Town", 121);
        RoadAccidentReport report3 = new RoadAccidentReport("Car", "Johannesburg", 178);
        RoadAccidentReport report4 = new RoadAccidentReport("Motorbike", "Johannesburg", 145);
        RoadAccidentReport report5 = new RoadAccidentReport("Car", "Port Elizabeth", 112);
        RoadAccidentReport report6 = new RoadAccidentReport("Motorbike", "Port Elizabeth", 89);

        // Print the reports
        report1.printAccidentReport();
        report2.printAccidentReport();
        report3.printAccidentReport();
        report4.printAccidentReport();
        report5.printAccidentReport();
        report6.printAccidentReport();
    }
}
    

