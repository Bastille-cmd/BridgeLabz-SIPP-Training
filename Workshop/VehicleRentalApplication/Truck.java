public class Truck extends Vehicle{
    Truck(int maxDays){
        super(maxDays);
    }

    int calculateRent(){
        int days=this.getDays();
        return 300*days ;
    }
}
