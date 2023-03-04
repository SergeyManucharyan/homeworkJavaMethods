package enumexercisetwo.exercisesix;

public enum PizzaSize {
    SMALL("small", 5),
    MEDIUM("medium", 8),
    LARGE("large", 12);
    private final String sizeName;
    private final int prize;

    PizzaSize(String sizeName, int prize) {
        this.sizeName = sizeName;
        this.prize = prize;
    }

    public String getSizeName() {
        return sizeName;
    }

    public int getPrize() {
        return prize;
    }
}
