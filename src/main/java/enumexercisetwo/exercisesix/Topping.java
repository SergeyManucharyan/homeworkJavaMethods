package enumexercisetwo.exercisesix;

public enum Topping {
    PEPPERONI("pepperoni"),
    CHEESE("cheese"),
    MUSHROOMS("mushrooms"),
    ONIONS("onions"),
    SAUSAGE("sausage");
    private final String name;

    Topping(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
