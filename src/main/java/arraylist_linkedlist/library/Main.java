package arraylist_linkedlist.library;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("title1", "author1", "publisher1", 2000, 98712365449662245L);
        Book book2 = new Book("title2", "author2", "publisher2", 2002, 13659552699544623L);
        Book book3 = new Book("title3", "author3", "publisher3", 2003, 23658971169541126L);
        Book book4 = new Book("title4", "author4", "publisher4", 2004, 87562315987546621L);
        Book book5 = new Book("title5", "author5", "publisher5", 2005, 35698214789955226L);
        Library library = new Library("Gradaran");
        library.addBook(book1);
        library.addBook(book2);
        System.out.println(library.titleSearch("title1"));
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.displayBooks();
        System.out.println("-------------------------------------");
        library.remove(book3);
        library.displayBooks();
    }
}
