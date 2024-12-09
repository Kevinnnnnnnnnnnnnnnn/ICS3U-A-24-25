package day1;

public class Car {

    private String make;
    private String model;
    private int year;
    private double mileage;

    public Car(String make, String model, int year, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public String getter() {
        return make;
    }

    public void setter(String newMake) {
        make = newMake;
    }

    public String displayCarDetails() {
        return "Your car's details: " + make + " " + model + ", " + year + " with " + mileage + " miles.";
    }

    public void drive(double milesDriven) {
        mileage += milesDriven;
    }
}
