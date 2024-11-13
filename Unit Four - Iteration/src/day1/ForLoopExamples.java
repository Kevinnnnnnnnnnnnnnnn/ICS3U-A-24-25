package day1;

public class ForLoopExamples {
    public static void main(String[] args) {
        // Use a loop to repeat a section of code.
        // For loops are designed to repeat code a specific number of times.
        // For loops are meant to count and have a built-in counter.

        //     start   boo-lean count
        //   |-------|  |----|  |-|
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        // int i = 0; defines the counter and sets its initial value,
        // i < 10; is the condition for the loop to continue,
        // i++ is the step by which i increases.

        // print -10 -8 -6 -4 -2 0 2 4
        for (int i = -10; i < 5; i += 2) {
            System.out.println(i);
        }

        // print 1000 to -1000
        for (int i = 1000; i >= -1000; i--) {
            System.out.println(i);
        }

        // sum the numbers from 1 to 1000
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        System.out.println(sum);

        // reverse the letters in a string
        String str = "Alphabet Soup";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.substring(i, i + 1));
        }

        // count the number of vowels
        int numVowels = 0;
        for (int i = 0; i < str.length(); i++) {
            String letter = str.substring(i, i + 1);
            // if (letter.equals("a") || letter.equals("A") || letter.equals("e") || letter.equals("E") || letter.equals("i") || letter.equals("I") || letter.equals("o") || letter.equals("O") || letter.equals("u") || letter.equals("U"))
            if ("aeiouAEIOU".indexOf(letter) != -1) {
                numVowels++;
            }
        }
        System.out.println(numVowels);
    }
}
