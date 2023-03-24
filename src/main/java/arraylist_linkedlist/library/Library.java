package arraylist_linkedlist.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public Book titleSearch(String title) {
        try {
            for (Book b : books) {
                if (b.getTitle().equals(title)) {
                    return b;
                }
            }
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Book with this title not found");
        }
        return null;
    }

    public Book authorSearch(String author) {
        try {
            for (Book b : books) {
                if (b.getAuthor().equals(author)) {
                    return b;
                }
            }
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Book with this author not found");
        }
        return null;
    }

    public void displayBooks() {
        for (Book b : books) {
            System.out.println(b.getAuthor() + " " + b.getTitle() + " " + b.getPublisher() + " " + b.getYear() + " " + b.getIsbn());
        }
    }

    public void remove(Book book) {
        List<Book> newList = new ArrayList<>();
        for (Book b : books) {
            if (!b.equals(book)) {
                newList.add(b);
            }
        }
        books = newList;
    }
}
