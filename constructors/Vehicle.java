package constructors;

public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Type: " + vehicleType);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

