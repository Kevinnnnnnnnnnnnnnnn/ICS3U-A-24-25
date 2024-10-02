package day2;

public class Driver {
    public static void main(String[] args) {
        Student student1 = new Student("Steve", 17, "1126804", 3.5, "Computer Science", 2025, true);
        Student student2 = new Student("Tessa", 16, "2312312", 4.0, "Engineering", 2026, true);
        
        String info1 = student1.getInfo(); // returns a string
        System.out.println(info1); // prints the string
        // System.out.println(student1.age);  // age is private and not visible
        student2.study(3);
    }
}
