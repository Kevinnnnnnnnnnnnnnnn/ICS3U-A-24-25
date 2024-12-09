package day1;

public class Book {

    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String t, String a, int y, double b) {
        title = t;
        author = a;
        yearPublished = y;
        price = b;
    }

    public Book(String t, String a) {
        title = t;
        author = a;
        yearPublished = 2000;
        price = 9.99;
    }

    public Book(String t) {
        title = t;
        author = "Unknown Author";
        yearPublished = 2000;
        price = 9.99;
    }

    public void displayDetails() {
        System.out.println("Book details: " + title + " by " + author + "; published in " + yearPublished + ". Costs " + price + ".");
    }

    public void displayDetails(boolean showTitleAndAuthorOnly) {
        if (showTitleAndAuthorOnly) {
            System.out.println(title + " by " + author);
        } else {
            displayDetails();
        }
    }

    public void displayDetails(String showTitleOnly) {
        if (showTitleOnly.equals("title")) {
            System.out.println(title);
        }
    }

    public String titleGetter() {
        return title;
    }

    public String authorGetter() {
        return author;
    }

    public int yearGetter() {
        return yearPublished;
    }

    public double priceGetter() {
        return price;
    }

    public void titleSetter(String newTitle) {
        title = newTitle;
    }

    public void authorSetter(String newAuthor) {
        author = newAuthor;
    }

    public void yearGetter(int newYear) {
        yearPublished = newYear;
    }

    public void priceSetter(double newPrice) {
        price = newPrice;
    }
    
}
