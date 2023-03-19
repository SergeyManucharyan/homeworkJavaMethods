package enumexercisetwo.exercisefive;

public enum Season {
    SPRING(14, 25),
    SUMMER(26, 40),
    FALL(-4, 13),
    WINTER(-30, -5);
    private final int min;
    private final int max;

    Season(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
