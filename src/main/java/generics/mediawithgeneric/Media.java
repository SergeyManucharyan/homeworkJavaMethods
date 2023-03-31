package generics.mediawithgeneric;

import java.util.ArrayList;

public class Media<T> {
    private ArrayList<T> mediaList;

    public Media() {
        mediaList = new ArrayList<>();
    }

    public Media(T t) {
        add(t);
    }

    public void add(T t) {
        mediaList.add(t);
    }

    public ArrayList<T> getMediaList() {
        return mediaList;
    }
}
