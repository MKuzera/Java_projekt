

public class Book {

    String nameOfBook;
    String author;
    int ID;
    int publicationDate;
    int pages;
    static int count = 0;
    public String getNameOfBook() {
        return nameOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public int getID() {
        return ID;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public int getPages() {
        return pages;
    }


    public Book(String nameOfBook, String author, int ID, int rokWydania, int pages) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.ID = ID;
        publicationDate = rokWydania;
        this.pages = pages;
        count+=1;
    }

    public Book(){
        nameOfBook = "EMPTY";
        author = "EMPTY";
        this.ID = -1;
        publicationDate = -1;
        pages = -1;
        count+=1;
    }

    public void DisplayBook(){
        System.out.println(this.author + " " + this.nameOfBook + " ID: " + this.ID +
                " number of pages" + this.pages + " publication date:"+ this.publicationDate);
    }


}
