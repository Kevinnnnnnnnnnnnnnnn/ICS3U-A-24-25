package day3;

public class ExampleTwo {
    public static void main(String[] args) {
        int numStudents = 15;
        numStudents++;
        ++numStudents;
        int y = 10;
        // y = numStudents++; uses numStudents then adds 1 to numStudents
        // y = ++numStudents; adds 1 to numStudents then assigns it to y 
        System.out.println(numStudents);
        System.out.println(y);
    }
}
