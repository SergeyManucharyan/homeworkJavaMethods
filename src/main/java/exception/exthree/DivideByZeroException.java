package exception.exthree;

public class DivideByZeroException extends Exception {
    @Override
    public String getMessage() {
        return "Can't divide by zero";
    }
}
