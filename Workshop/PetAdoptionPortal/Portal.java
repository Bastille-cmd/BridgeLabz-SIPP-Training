import java.util.ArrayList;
import java.util.List;

public class Portal<T> {
    List<T> pets;

    Portal(){
        this.pets=new ArrayList<>();
    }

    void add(T pet){
        pets.add(pet);
    }
    void displayData(){
        for(T pet : pets){
            System.out.println(pet);
        }
    }
}
