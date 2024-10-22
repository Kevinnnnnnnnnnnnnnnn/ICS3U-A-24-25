package day1;

public class BooleanExpressions {
    public static void main(String[] args) {
        // boolean variables can hold true or false
        boolean hasRedShoes = true; 
        // a boolean expression evaluates to true or false
        System.out.println(hasRedShoes == false);

        // another form of boolean expressions
        int age = 23;
        System.out.println(age >= 18); // true

        // logical operators
        /*
         * >
         * <
         * >=
         * <=
         * ==
         * !=
         * 
         * !
         * 
         * 
         */

        boolean x = age != 18; // x is true
        boolean y = !(7 > 9); // y is true
        boolean z = !!hasRedShoes; // z is true   
        
        int a = 7;
        int b = 3;
        boolean test1 = a > 6;
        boolean test2 = b <= 2;
        boolean mystery = !test1 == test2; // true
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(mystery);
    }
}
