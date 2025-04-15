package day2;

public class ObjectToString {
    public static void main(String[] args) {
        // Create an instance of the Vehicle class
        Car car1 = new Car("Electric", "Tesla Model S");
        Car car2 = new Car("Electric", "Tesla Model S");
        Car car3 = new Car("Sedan", "Toyota Camry");
        System.out.println(car1); // Implicitly calls the toString() method
        System.out.println(car1.toString()); // Explicitly calls the toString() method

        System.out.println(car1 == car2); // False; different objects in memory
        System.out.println(car1.equals(car2)); // True; same model and type
        System.out.println("Hi".equals("Hi")); // True; String comparison
        System.out.println(car1.equals(car3)); // False; different models
        
        // Create an instance of the Coffee class
        Coffee coffee = new Coffee();
        
        // Call the setSize method to set the size of the coffee
        coffee.setSize("Large");
    }
}
