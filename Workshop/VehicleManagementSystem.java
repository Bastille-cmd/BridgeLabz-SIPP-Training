public class VehicleManagementSystem {
    public static void main(String[] args) {
        Car car=new Car("Tesla","Cybertruck","Electric");
        Truck truck=new Truck("Volve", "truck", "Petrol");
        Bike bike=new Bike("Hero", "Splendor", "Petrol");
        car.displayDetails();
        truck.displayDetails();
        bike.displayDetails();
        
    }
}

abstract class Vehicle{
    private final String brand;
    private final String model;
    private String fuelType;

    Vehicle(String brand, String model, String fuelType){
        this.brand=brand;
        this.model=model;
        this.fuelType=fuelType;
    }

    public void displayDetails(){
        System.out.println("Brand :" +this.brand);
        System.out.println("Model : "+this.model);
        System.out.println("Fuel Type : "+this.fuelType);
    }

    abstract int calculateServiceCost();
}

class Car extends Vehicle{
    Car(String brand, String model, String fuelType){
        super(brand,model,fuelType);
    }

    public int calculateServiceCost(){
        return 0;
    }
}

class Truck extends Vehicle{
    Truck(String brand, String model, String fuelType){
        super(brand,model,fuelType);
    }

    public int calculateServiceCost(){
        return 0;
    }
}

class Bike extends Vehicle{
    Bike(String brand, String model, String fuelType){
        super(brand,model,fuelType);
    }

    public int calculateServiceCost(){
        return 0;
    }
}
