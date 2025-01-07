package day1;

public class ArrayExamples_v2 {
    public static void main(String[] args) {
        exampleOne();
        System.out.println();
        exampleTwo();
        System.out.println();
        exampleThree();
        System.out.println();
        exampleFour();
    }
                        
    private static void exampleFour() {
        String[] strings = {"Hello", "Goodbye", "Cya"};

        for (String str : strings) {                    // for-each loop - iterates the array from left to right
            System.out.println(str);
        }
        System.out.println();

        int[] nums = {3, 1, 7};
        
        for (int i : nums) {
            i *= 3;                                     // coesn't change the array
            System.out.println(i);
        }
    }

    private static void exampleThree() {
        int[] marks = new int[10];                      // Stores 0 in every element.
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        double[] stuffs = new double[10];               // Stores 0 in every element.
        for (int i = 0; i < stuffs.length; i++) {
            System.out.println(stuffs[i]);
        }

        boolean[] gyats = new boolean[10];
        for (int i = 0; i < gyats.length; i++) {
            System.out.println(gyats[i]);
        }
    }

    private static void exampleTwo() {
        double[] values = {3.5, -1.2, 0.3, 5.9, 9.25};
        System.out.println(values[1]);
        
        for (int i = values.length - 1; i >= 0; i--) {  // To access the element, use [index].
            System.out.println(i + 1 + ": " + values[i]);
        }

        System.out.println();
        
        for (int i = 0; i < values.length; i++) {
            if (values[i] < 0) {
                values[i] = Math.abs(values[i]);        // modified the array
            }
        }

        for (int i = 0; i < values.length; i++) {
            System.out.println(i + 1 + ": " + values[i]);
        }
    }
        
    private static void exampleOne() {
        int[] nums = {6, 2, 1, -4};
        // nums refers to the array. 
        // There are 4 elements in the array.
        // length is a property of an array.
        System.out.println(nums.length);
    }
}
