package day2;

public class IfElseIfElseStatements {
    public static void main(String[] args) {
        int mark = 76;
        if (mark >= 80) System.out.println("A");
        else if (mark >= 70) System.out.println("B");
        else if (mark >= 60) System.out.println("C");
        else if (mark >= 50) System.out.println("D");
        else System.out.println("lmao");
        // else marks the end of an if statement
        // must start with if
        // can have as many else ifs as needed
        // only one else allowed
    }
}
