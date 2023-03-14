package library.data;



public class Book {

    private String nameOfBook;
    private String author;
    private int ID;
    private String publicationDate;
    private int pages;
    private static int count = 0;


    public Book(String nameOfBook, String author, String pubDate, int pages) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        count+=1;
        this.ID = count;
        publicationDate = pubDate;
        this.pages = pages;
        count+=1;
    }

    public Book(){
        nameOfBook = "EMPTY";
        author = "EMPTY";
        count+=1;
        this.ID = count;
        publicationDate = "EMPTY";
        pages = -1;

    }

    public void displayBook(){
        System.out.println(this.author + " " + this.nameOfBook + " ID: " + this.ID +
                " number of pages" + this.pages + " publication date: "+ this.publicationDate);
    }


    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    public String getNameOfBook() {
        return nameOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public int getID() {
        return ID;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public int getPages() {
        return pages;
    }


}
