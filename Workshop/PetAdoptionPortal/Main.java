public class Main {
    public static void main(String[] args) {
        Portal<Pet> portal = new Portal<>();

        Dog dog = new Dog("dog",4);
        Cat cat = new Cat("cat",5);

        portal.add(dog);
        portal.add(cat);
        portal.displayData();
        dog.setAdopted();
        portal.displayData();
    }
}
