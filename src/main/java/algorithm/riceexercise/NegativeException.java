package algorithm.riceexercise;

public class NegativeException extends Exception {
    @Override
    public String getMessage() {
        return "Bags count can't be negative number";
    }
}
