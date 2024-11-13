package day3;

public class CompoundBooleanExpressions {
    public static void main(String[] args) {

        // AND
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false /* && true  */);
        System.out.println(false /* && false */);
        /*
         * In the last two expressions, java does not read the second boolean
         * because the first false already means the expression evaluates to false.
         * This is called short-circuiting.
         */

        String str = "";
        if (str != null && str.length() > 0) {
            System.out.println("yes");
        }

        boolean hasRedShoes = true;
        int age = 17;
        boolean result = hasRedShoes && age > 18;
        System.out.println(result);

        if (hasRedShoes && age < 18) {
            System.out.println("nuh uh");
        }

        // OR
        System.out.println(true /* || true  */);
        System.out.println(true /* || false */);
        System.out.println(false || true);
        System.out.println(false || false);
        /*
         * In the last two expressions, java does not read the second boolean
         * because the first true already means the expression evaluates to true.
         * This is called short-circuiting.
         */

    }
}
