package day2;

public class Student {
    // Data members / instnace variables / attributes
    private String name;
    private int age;
    private String studentId;
    private double gpa;
    private String major;
    private int year;
    private boolean isFullTime;

    // Constructor - creates the object and sets an initial state (gives initial values to the attributes).
    // Arguments / parameters are in the round brackets; they are required for the function / method in Java to execute.
    public Student(String name, int age, String studentId, double gpa, String major, int year, boolean isFullTime) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.gpa = gpa;
        this.major = major;
        this.year = year;
        this.isFullTime = isFullTime;
    }

    // Methods
    // Not all methods require arguments or parameters.
    public void study(int hours) {
        System.out.println(name + " studied for " + hours + " hours.");
    }

    public void attendClass(String className) {
        System.out.println(name + " attended " + className + " class.");
    }

    public void takeExam(String subject) {
        System.out.println(name + " is taking an exam in " + subject + ".");
    }

    public void updateGpa(double newGpa) {
        this.gpa = newGpa;
        System.out.println(name + "'s GPA has been updated to: " + gpa);
    }

    public String getInfo() {
        return "Name: " + name + ", Student ID: " + studentId + ", GPA: " + gpa + ", Major: " + major + ", Year: " + year + ", Full-time: " + (isFullTime ? "Yes" : "No");
    }

    public boolean isHonors() {
        return gpa >= 3.5;
    }
}