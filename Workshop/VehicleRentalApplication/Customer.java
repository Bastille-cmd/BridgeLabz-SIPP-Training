

public class Customer {
    private String name;
    private String phone;
    private Vehicle rentedVehicle;
    Customer(String name, String phone){
        this.name=name;
        this.phone=phone;
    }

    String getName(){
        return this.name;
    }

    String getPhone(){
        return this.phone;
    }

    public void setRentedVehicle(Vehicle vehicle) {
        this.rentedVehicle=vehicle;
    }

    Vehicle getRentedVehicle(){
        return this.rentedVehicle;
    }
}
