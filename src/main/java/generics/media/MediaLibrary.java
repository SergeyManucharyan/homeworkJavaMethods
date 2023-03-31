package generics.media;

import java.util.ArrayList;

public class MediaLibrary {
    private ArrayList<Book> books;
    private ArrayList<Newspaper> newspapers;
    private ArrayList<Video> videos;

    public MediaLibrary() {
        books = new ArrayList<>();
        newspapers = new ArrayList<>();
        videos = new ArrayList<>();
    }

    public void addBooks(Book b) {
        books.add(b);
    }

    public void addNewspaper(Newspaper n) {
        newspapers.add(n);
    }

    public void addVideo(Video v) {
        videos.add(v);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Newspaper> getNewspapers() {
        return newspapers;
    }

    public void setNewspapers(ArrayList<Newspaper> newspapers) {
        this.newspapers = newspapers;
    }

    public ArrayList<Video> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<Video> videos) {
        this.videos = videos;
    }

    @Override
    public String toString() {
        return "books=" + books +
                "\nnewspapers=" + newspapers +
                "\nvideos=" + videos;
    }
}
