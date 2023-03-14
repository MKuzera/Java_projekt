package library.app;

import library.data.Library;
import library.logic.DataReader;
import library.data.Book;

public class LibraryControl {

    private final int exit = 0;
    private final int addBook = 1;
    private final int displayBooks = 2;


    private DataReader dataReader = new DataReader();
    private Library library = new Library();

    int option;
    public void controlLoop(){
        int option;
        do{
            printOptions();

            option = dataReader.getInt();

            switch (option){
                case addBook:
                    addBook();
                    break;

                case exit:
                    System.exit(0);
                    break;

                case displayBooks:
                    displayBooks();
                    break;



            }

        }while(true);
    }

    private void displayBooks() {
        library.displayBooks();
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printOptions() {
        System.out.println("Choose option:");
        System.out.println(exit + " - Exit");
        System.out.println(addBook + " - Add Book");
        System.out.println(displayBooks + " - Display Books");

    }
}
