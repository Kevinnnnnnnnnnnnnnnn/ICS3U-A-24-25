package day3;

public class Library {
    private Book[] books; // Array of Book objects
    private int numBooks; // Number of books currently in the library

    // Constructor that initializes the array with a specific capacity
    public Library(int capacity) {
        books = new Book[capacity]; // Create an array with the given capacity
        numBooks = 0; // Initially, no books are added
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        if (numBooks < books.length) {
            books[numBooks] = book; // Place the book at the current index
            numBooks++; // Increment the number of books in the library
        } else {
            System.out.println("Library is full, cannot add more books.");
        }
    }

    // Stub method to display all books in the library
    public void displayBooks() {
        // for (Book book : books) {
        //     if (book != null)
        //         System.out.println(book);
        // }
        for (int i = 0; i < numBooks; i++) {
            System.out.println(books[i]);
        }
    }

    public void displayAvailable() {
        for (int i = 0; i < numBooks; i++) {
            if (!books[i].isBorrowed()) {
                System.out.println(books[i]);
            }
        }
    }

    // Stub method to borrow a book from the library
    public Book borrowBook(String title) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getTitle().equals(title) && !books[i].isBorrowed()) {
                books[i].setBorrowed(true);
                return books[i];
            }
        }
        System.out.println("Unable to borrow the book.");
        return null;
    }
}