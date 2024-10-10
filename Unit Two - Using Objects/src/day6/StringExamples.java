package day6;

public class StringExamples {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        // == checks if the memory locations stored in String objects are the same
        System.out.println(s1 == s2); // true
        // Only use == to compare primitives, not object types.

        String str1 = new String("Hello");
        String str2 = new String("Hello");
        // These objects don't store the same values.
        System.out.println(str1 == str2); // false

        // Use equals() to compare two String objects - it checks for the same sequence of characters.
        System.out.println(str1.equals(str2)); // true

        // Use compareTo() to compare the values of two String objects
        System.out.println("Hello".compareTo("Hello"));     //  0
        System.out.println("Dev".compareTo("Ian"));         // -5
        System.out.println("Louisa".compareTo("Ian"));      //  3
        System.out.println("Simon".compareTo("Stefano"));   // -11
        System.out.println("Stefano".compareTo("Simon"));   //  11
        System.out.println("Dog".compareTo("dog"));         // -32

        System.out.println("abcd".compareTo("abcde"));      // -1
    }
}
