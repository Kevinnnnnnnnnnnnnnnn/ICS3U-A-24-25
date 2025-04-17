package day4;

public class Textbook extends Book {

    private int editionNumber;

    public Textbook (String title, double price, int editionNumber) {
        super(title, price);
        this.editionNumber = editionNumber;
    }

    public int getEdition () {
        return editionNumber;
    }

    public String getBookInfo () {
        return super.getBookInfo() + "-" + editionNumber;
    }

    public boolean canSubstituteFor (Textbook tBook) {
        return (tBook.getTitle().equals(this.getTitle()) && this.editionNumber > tBook.editionNumber);
    }

}
