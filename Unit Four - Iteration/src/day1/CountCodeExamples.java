package day1;

public class CountCodeExamples {
    public static void main(String[] args) {
        int numCats = countCat("catdccatca");
        System.out.println(numCats);
    }

    private static int countCat(String str) {
        int numCar = 0;
        for (int i = 0; i <= str.length() - 3; i++) {
            String s = str.substring(i, i + 3);
            if (s.equals("cat")) 
                numCar++;
        }
        return numCar;
    }
}
