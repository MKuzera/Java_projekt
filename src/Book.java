

public class Book {

    String NameOfBook;
    String Author;
    int ID;
    int PublicationDate;
    int Pages;
    static int count = 0;
    public String getNameOfBook() {
        return NameOfBook;
    }

    public String getAuthor() {
        return Author;
    }

    public int getID() {
        return ID;
    }

    public int getPublicationDate() {
        return PublicationDate;
    }

    public int getPages() {
        return Pages;
    }


    public Book(String nameOfBook, String author, int ID, int rokWydania, int pages) {
        NameOfBook = nameOfBook;
        Author = author;
        this.ID = ID;
        PublicationDate = rokWydania;
        Pages = pages;
        count+=1;
    }

    public Book(){
        NameOfBook = "EMPTY";
        Author = "EMPTY";
        this.ID = -1;
        PublicationDate = -1;
        Pages = -1;
        count+=1;
    }

    public void DisplayBook(){
        System.out.println(this.Author + " " + this.NameOfBook + " ID: " + this.ID +
                " number of pages" + this.Pages + " publication date:"+ this.PublicationDate);
    }


}
