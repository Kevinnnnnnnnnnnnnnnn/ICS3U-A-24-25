package day3;

public class ExampleFive {
    public static void main(String[] args) {
        double x = 7.3;
        // cannot assign a double to an int so use explicit casting
        // narrowing conversion
        int y = (int)x;
        System.out.println(y);
    }
}
