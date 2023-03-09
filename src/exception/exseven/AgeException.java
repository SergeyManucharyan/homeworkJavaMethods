package exception.exseven;

public class AgeException extends Exception{
    @Override
    public String getMessage() {
        return "Age must be between 0 - 120";
    }
}
