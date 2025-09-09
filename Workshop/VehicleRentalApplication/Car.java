public class Car extends Vehicle{
    Car(int maxDays){
        super(maxDays);
    }

    int calculateRent(){
        int days=this.getDays();
        return 200*days;
    }
}
