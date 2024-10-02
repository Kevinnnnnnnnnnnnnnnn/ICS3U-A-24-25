package day3;

public class Driver {
    public static void main(String[] args) {

        Dog myDog = new Dog("Rocky", "Labrador", 5);
        Owner owner1 = new Owner("Emily", myDog);

        owner1.walkDog(20);
        owner1.feedDog("chicken");
        myDog.sleep(8);
        owner1.printDogAge();

        Dog secondDog = new Dog("Luna", "Poodle", 7);
        secondDog.bark(2);
        Owner owner2 = new Owner("David", secondDog);
        owner2.walkDog(15);
        owner2.feedDog("beef");
        owner2.printDogAge();
        myDog.sleep(6);
        secondDog.sleep(7);
        
    }
}
