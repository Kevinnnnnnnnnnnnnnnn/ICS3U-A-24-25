package day3;

public class LibraryClient {
    public static void main(String[] args) {
        Library library = new Library(10);
        library.addBook(new Book("Catcher in the Rye", "J.R. Salinger"));
        library.addBook(new Book("Hamlet", "William Shakespeare"));

        library.displayBooks();
        library.displayAvailable();

        Book b1 = library.borrowBook("Hamlet");
        if (b1 != null) {
            System.out.println(b1);
        }
        Book b2 = library.borrowBook("The Natural");
    }
}
