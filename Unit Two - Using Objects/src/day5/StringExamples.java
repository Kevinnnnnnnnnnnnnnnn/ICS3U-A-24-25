package day5;

public class StringExamples {
    public static void main(String[] args) {
        System.out.println("This is a string");
        int x = 7, y = 8;

        // string concatenation - anything + a string = a string
        System.out.println("Answer is " + x + y); // Answer is 78

        // adds x and y before contatenating
        System.out.println("Answer is " + (x + y)); // Answer is 15

        // we can create a String literal without a constructor
        String message = "AP  COMP  SCI  ROCKS";
        System.err.println(message);

        String s1 = "Apple";
        String s2 = "Mango";
        String s3 = "Apple";
        // s1 and s3 hold the same address so they are equal
        System.out.println(s1 == s2); // false
        System.out.println(s1 == s3); // true
        // changing s3 creates a new String object
        s3 = "Orange";

        // declaring a string using the constructor
        String str1 = new String("Apple");
        String str2 = new String("Mango");
        String str3 = new String("Apple");
        // a new set of characters is created for each new String object
        System.out.println(str1 == str2); // false
        System.out.println(str1 == str3); // false
        System.out.println(s1 == str1); // compares new String object to a String literal

        // length() method
        System.out.println(message.length()); // returns a number that is 1 greater than the largest index
        System.out.println(message.indexOf("SCI")); // returns 10 which is the index of the first occurrence
        System.out.println(message.indexOf("sci")); // returns -1 as it is not found
    }
}
