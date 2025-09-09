public abstract class Vehicle {
    private int days;
    Vehicle(int days){
        this.days=days;
    }

    int getDays(){
        return this.days;
    }
    abstract int calculateRent();
}
