package day4;

public class MathExample {
    public static void main(String[] args) {
        double x = -7.9;
        System.out.println(Math.abs(x));
        System.out.println(Math.sqrt(81));
        System.out.println(Math.pow(2, 3));
        // everything in the Math class is static and belongs to the class
        // the Math class does not have a constructor because everything is static
        // call methods and constants using the class directly
    }
}
