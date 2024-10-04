package day4;

public class WrapperExample {
    public static void main(String[] args) {
        Integer int1 = new Integer(7);
        System.out.println(int1.intValue());

        Integer int2 = 8;           // wraps the primitive int 8 in an Integer - auto-boxing
        System.out.println(int2);   // auto unboxing - converts to a primitive int

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}  
