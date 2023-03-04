package enumexercisetwo.exercisetwo;

public class Coffee {
    public static void main(String[] args) {
        for (CoffeeSize coffee : CoffeeSize.values()) {
            System.out.println(coffee + " " + coffee.getValue() + " gr");
        }
        ;
    }
}
