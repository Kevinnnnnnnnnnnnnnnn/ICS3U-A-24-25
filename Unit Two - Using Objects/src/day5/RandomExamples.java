package day5;

public class RandomExamples {
    public static void main(String[] args) {
        // generate 1000 random numbers between 0.0 inclusive and 1.0 exclusive
        for (int i = 0; i < 1000; i++) {
            System.out.println(Math.random());
        }

        // generate an integer from 1 to 10 inclusive
        int num = (int)(Math.random() * 10) + 1;
        System.out.println(num);

        // generate an integer from -10 to 10 inclusive
        num = (int)(Math.random() * 21) + -10;

        // generate a random integer from min to max inclusive - general formula
        int min = 8;
        int max = 123;
        num = (int)(Math.random() * (max - min + 1)) + min;

    }
}
