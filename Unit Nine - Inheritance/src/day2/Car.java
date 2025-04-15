package day2;

public class Car extends Vehicle {
    private String model;

    public Car(String type, String model) {
        super(type); // Calls Vehicle constructor
        this.model = model;
        System.out.println("Car constructor called");
    }

    // When a child class writes its own version of a method that it inherits
    // from the parent, it is called Method Override
    // Same method name and arguments / parameters
    public void start() {
        super.start(); // Optional: call the parent version first
        System.out.println("Starting the car...");
    }

    // Method is not overriding a parent method.
    // start() and start(msg) are overloaded methods: two methods with the same name but different parameter lists.
    public void start(String msg) {
        super.start();
        System.out.println(msg);
    }

    public void describe() {
        super.describe(); // Calls Vehicle's describe method
        System.out.println("Model: " + model);
    }

    public String toString() {
        return super.toString() + ", " + model;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true; // Same object reference
        
        if (!(obj instanceof Car))
            return false;
        
        Car cObj = (Car) obj;

        return cObj.model.equals(this.model) && super.equals(cObj);
    }
}
