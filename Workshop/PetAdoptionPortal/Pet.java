public class Pet{
    String type;
    int age;
    boolean isAdopted;

    Pet(String type, int age){
        this.type=type;
        this.age=age;
    }

    void setAdopted(){
        this.isAdopted=true;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", age=" + age +
                ", isAdopted=" + isAdopted +
                '}';
    }
}
