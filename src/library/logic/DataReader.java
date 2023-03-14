package library.logic;
import library.data.Book;
import java.util.Scanner;

public class DataReader {
    private Scanner scanner = new Scanner(System.in);
    public Book readAndCreateBook(){

        scanner.nextLine();
        System.out.println("\nTitle:");
        String title = scanner.nextLine();


        System.out.println("Author:");
        String autor = scanner.nextLine();


        System.out.println("Publication date:");
        String date = scanner.nextLine();


        System.out.println("Pages: ");
        int pages = scanner.nextInt();


        Book book = new Book(title,autor,date,pages);
        return book;
    }

    public int getInt(){
        int i = scanner.nextInt();
        return i;
    }




}
