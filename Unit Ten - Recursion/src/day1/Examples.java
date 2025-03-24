package day1;

public class Examples {

    static long[] solved;
    public static void main(String[] args) {
        System.out.println(factorialRecursion(7));
        System.out.println(factorialIterative(7));
        solved = new long[101];
        System.out.println(fib(7));
    }

    public static int factorialRecursion(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorialRecursion(n - 1);
    }

    public static int factorialIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }

    public static long fib(int n) {
        if (n == 1 || n == 2)
            return 1;
        if (solved[n] != 0)
            return solved[n];
        solved[n] = fib(n - 1) + fib(n - 2);
        return solved[n];
    }
}
