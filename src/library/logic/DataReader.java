package library.logic;
import library.data.Book;
import java.util.Scanner;

public class DataReader {
    private Scanner scanner = new Scanner(System.in);
    public Book readAndCreateBook(){

        Book book = new Book();

        System.out.println("Title:");
        String title = scanner.nextLine();
        book.setNameOfBook(title);

        System.out.println("Author:");
        String autor = scanner.nextLine();
        book.setAuthor(autor);

        System.out.println("Publication date:");
        String date = scanner.nextLine();
        book.setPublicationDate(date);

        System.out.println("Pages: ");
        int pages = scanner.nextInt();
        book.setPages(pages);

        return book;
    }

    public int getInt(){
        int i = scanner.nextInt();
        return i;
    }




}
