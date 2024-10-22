package day1;

public class IfStatements {
    public static void main(String[] args) {
        boolean hasRedShoes = false;
        if (hasRedShoes) {
            System.out.println("u have nice red shoes");
        }

        if (!hasRedShoes) { // if (hasRedShoes == false) noobs' way of writing this statement
            System.out.println("u should buy some red shoes");
        }

        int x = 565675;
        // if statements with only one line can omit the {}
        if (x % 2 == 0) System.out.println("Even");
        if (x % 2 == 1) System.out.println("Odd");

        x = 73;
        // without {}, only one line is read as part of the if statement
        if (x > 10)
            System.out.println("Hello...");
            System.out.println("Hi...");
    }
}
