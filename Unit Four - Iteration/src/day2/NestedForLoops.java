package day2;

public class NestedForLoops {
    public static void main(String[] args) {
        createBox(7, 3);
        createTriangle(7);
        createInvTri(6);
        createEmptyBox(5, 6);
    }

    public static void createBox(int l, int h) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void createTriangle(int h) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void createInvTri(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 0; j < h - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void createEmptyBox(int l, int h) {
        for (int i = 1; i <= l; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= h - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < l - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < l; i++) {
            System.out.print("*");
        }
    }
}
