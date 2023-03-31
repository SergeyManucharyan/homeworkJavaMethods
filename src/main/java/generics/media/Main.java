package generics.media;

/**
 * Design a class that acts as a library for the following kinds of media: book, video,
 * and newspaper. Provide one version of the class that uses generics and one that
 * does not. Feel free to use any additional APIs for storing and retrieving the media.
 */
public class Main {
    public static void main(String[] args) {
        MediaLibrary lib = new MediaLibrary();
        lib.addBooks(new Book("BookName"));
        lib.addNewspaper(new Newspaper("News"));
        lib.addNewspaper(new Newspaper("News111"));
        lib.addVideo(new Video("VideoName"));
        System.out.println(lib.getBooks());
        System.out.println(lib.getVideos());
        System.out.println(lib.getNewspapers());
        System.out.println(lib);
    }
}
