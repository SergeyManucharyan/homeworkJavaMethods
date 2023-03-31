package generics.media;

public class Newspaper {
    private String name;

    public Newspaper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
