
import library.data.Book;
import library.logic.DataReader;

public class Main {
    public static void main(String[] args) {

        DataReader dataReader = new DataReader();
        Book[] books = new Book[10];
        books[0] = new Book("W pustyni i w puszczy","nie znam","10.01.2022",199);
        books[1] = new Book("macierze","nie znam","12.01.2022",200);
        books[2] = dataReader.readAndCreateBook();



    }
}
