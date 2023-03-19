package algorithm.riceexercise;

public class ZeroException extends Exception {
    @Override
    public String getMessage() {
        return "Rice count can't be zero";
    }
}
