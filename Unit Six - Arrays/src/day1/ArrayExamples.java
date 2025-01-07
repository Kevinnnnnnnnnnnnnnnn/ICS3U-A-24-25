package day1;

public class ArrayExamples {
    public static void main(String[] args) {
        exampleOne();
        exampleTwo();
        exampleThree();
    }

    public static void exampleOne() {
        int[] nums = {6, 5, 4, 2, 1, -1, 9, 3};
        System.out.println(nums.length);

        for (int i = 0; i < nums.length; i++) { // iterates thru the array
            System.out.println(nums[i]);        // prints the element selected from the array
        }
    }

    private static void exampleTwo() {
        int[] nums = {6, 5, 4, 2, 1, -1, 9, 3};

        for (int nextInt : nums) {              // iterates left-to-right in the array and makes a copy
            System.out.println(nextInt);        // of the next element and stores it in nextInt
        }                                       // no access to indeces
    }

    private static void exampleThree() {
        int[] nums = new int[10];               // creates a new int array of length 10 that stores 0s by default

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * 100) + 1;
        }

        for (int el : nums) {
            System.out.println(el);
        }
    }
}
