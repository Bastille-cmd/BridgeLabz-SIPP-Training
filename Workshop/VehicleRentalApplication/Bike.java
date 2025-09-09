public class Bike extends Vehicle{
    Bike(int days){
        super(days);
    }

    @Override
    int calculateRent(){
        int days=this.getDays();
        return 100*days;
    }
}
