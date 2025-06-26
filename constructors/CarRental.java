package constructors;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 1000;

    public CarRental() {
        this.customerName = "Customer";
        this.carModel = "Model";
        this.rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }
}
