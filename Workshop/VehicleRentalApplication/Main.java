import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exit=false;
        List<Customer> customerList = new ArrayList<>();
        while(!exit){
            Scanner sc = new Scanner(System.in);
            System.out.println("* Press 1 to rent a vehicle\n" +
                    "* Press 2 for Details.\n" +
                    "* Press 0 to exit");
            int initialChoice=sc.nextInt();
            switch (initialChoice){
                case 2:{
                    System.out.println("-----Customer Details------");
                    for(Customer customers : customerList){
                        Vehicle rentedVehicle=customers.getRentedVehicle();
                        System.out.println(customers.getName()+" "+customers.getPhone()+" "+(rentedVehicle instanceof Bike?"Bike":(rentedVehicle instanceof Car)?"Car":"Truck")+" "+rentedVehicle.calculateRent());
                    }
                    break;
                }
                case 0:{
                    exit=true;
                    break;
                }
                case 1:{
                    System.out.println("Enter Name");
                    String name=sc.next();
                    System.out.println("Enter phone number");
                    String phone=sc.next();
                    Customer customer=new Customer(name,phone);
                    customerList.add(customer);
                    System.out.println("""
                    * Press 1 for Bike. 100 per day.
                    * Press 2 for Car. 200 per day.
                    * Press 3 for Truck. 300 per day.
                    * Press 4 for Details.""");


                    int choice = sc.nextInt();
                    System.out.println("Enter Days");
                    int maxDays=sc.nextInt();
                    switch (choice){
                        case 1:{
                            Bike bike= new Bike(maxDays);
                            customer.setRentedVehicle(bike);
                            break;
                        }
                        case 2:{
                            Car car = new Car(maxDays);
                            customer.setRentedVehicle(car);
                            break;
                        }
                        case 3:{
                            Truck truck = new Truck(maxDays);
                            customer.setRentedVehicle(truck);
                            break;
                        }
                        case 4:{

                        }

                    }
                }
            }
        }
    }
}
