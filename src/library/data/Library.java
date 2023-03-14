package library.data;

public class Library {


    private final int maxBooks = 100;
    private int booksNumber = 0;
    private  Book[] books = new Book[maxBooks];


    public void addBook(Book book){
        if(booksNumber<maxBooks){
            books[booksNumber] = book;
        }
        else{
            System.out.println("No space for another books");
        }

    }

    public void displayBooks() {

        if (booksNumber == 0) {
            System.out.println("No books in this library");
        } else {
            for (Book a : books) {
                a.displayBook();
            }
        }
    }


}
