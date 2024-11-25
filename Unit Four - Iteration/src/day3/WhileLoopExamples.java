package day3;

public class WhileLoopExamples {
    public static void main(String[] args) {
        int start = 0;
        int end = 100;
        System.out.println(whileLoopSum(start, end));
    }

    private static int whileLoopSum(int start, int end) {
        int sum = 0;
        while(start <= end) {
            sum += start;
            start++;
        }
        return sum;
    }
}
