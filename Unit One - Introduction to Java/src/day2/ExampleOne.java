package day2;

public class ExampleOne {
    public static void main(String[] args) {
        // add the digits from a four-digit number
        int n = 4321;

        int n1 = n / 1000;
        int n2 = n / 100 % 10;   // 4321 / 100 = 43, 43 % 10 = 3
        int n3 = n / 10 % 10;    // 4321 / 10 = 432, 432 % 10 = 2
        int n4 = n % 10;

        System.out.println(n1 + n2 + n3 + n4);
    }
}
