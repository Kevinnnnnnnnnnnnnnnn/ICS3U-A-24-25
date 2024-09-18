package day3;

public class ExampleFour {
    public static void main(String[] args) {
        int mark1 = 87, mark2 = 97, mark3 = 63;
        int numMarks = 3;

        // explicit cast on numMarks: int to double (temporary)
        // just need to make one of the variables a double
        // but don't cast AFTER all the operations have been completed - would be same as implicit cast
        double average = (mark1 + mark2 + mark3) / (double)numMarks;

        System.out.println(average);
    }
}
