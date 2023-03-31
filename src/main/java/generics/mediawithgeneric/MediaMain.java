package generics.mediawithgeneric;

import generics.media.Book;

/**
 * Design a class that acts as a library for the following kinds of media: book, video,
 * and newspaper. Provide one version of the class that uses generics and one that
 * does not. Feel free to use any additional APIs for storing and retrieving the media.
 */
public class MediaMain {
    public static void main(String[] args) {
        Book book = new Book("BOOK");
        Media<Book> media = new Media<>();
        media.add(book);
    }
}
