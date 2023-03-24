package arraylist_linkedlist.library;

public class Book {
    // books have title,  author,
    //publisher, year of publishing and ISBN
    private String title;
    private String author;
    private String publisher;
    private int year;
    private long isbn;

    public Book(String title, String author, String publisher, int year, long isbn) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.isbn = isbn;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public long getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "title= " + title + " author= " + author + " publisher= " + publisher + " year= " + year + " isbn= " + isbn;
    }
}
