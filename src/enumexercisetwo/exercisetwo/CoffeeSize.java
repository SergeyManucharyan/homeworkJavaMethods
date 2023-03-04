package enumexercisetwo.exercisetwo;

/**
 * Create an enum called "CoffeeSize" that contains values for small, medium, and large coffee sizes.
 * Write a program that prints the name and ordinal value of each size.
 */
public enum CoffeeSize {
    SMALL(100),
    MEDIUM(200),
    LARGE(500);
    private final int value;

    CoffeeSize(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
