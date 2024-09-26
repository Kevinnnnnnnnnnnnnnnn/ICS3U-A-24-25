package day1;

public class ExampleOne {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Coco", 7, "Toy poodle", 15.3);
        dog1.bark();
        dog1.eat("steak");

        Swim swimmer = new Swim();
        swimmer.dive();
    }
}
