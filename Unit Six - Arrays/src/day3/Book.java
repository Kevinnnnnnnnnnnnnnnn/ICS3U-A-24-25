package day3;

public class Book {
    private String author;
    private String title;
    private boolean isBorrowed;

    // Constructor to initialize the title and author, set isBorrowed to false
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false; // default value
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for isBorrowed
    public boolean isBorrowed() {
        return isBorrowed;
    }

    // Setter for isBorrowed
    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    // toString method to return a string representation of the book
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Borrowed: " + isBorrowed;
    }
}
