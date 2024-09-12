package day1;

public class ExampleThree {
    public static void main(String[] args) {

        int numStudents = 14; // variables use camel case
        double volume = 123.7; // "double" holds floating-point decimal numbers
        boolean largeClass = numStudents > 20;

        System.out.println(numStudents);
        System.out.println(volume);
        System.out.println(largeClass);

        int a = 5, b = 7;
        int sum = a + b;
        System.out.println(sum);

        double c = 6.5, d = 10;
        System.out.println(d); // automatically prints out a decimal point
        System.out.println(c + d);

        System.out.println(c / d);
        System.out.println(a / b); // division between integers
        System.out.println(b / a); // cuts off decimals in output

        System.out.println(7 % 5); // 7 / 5 has a remainter of 2
        System.out.println(7 / 5);
        System.out.println(a / d);

    }
}
