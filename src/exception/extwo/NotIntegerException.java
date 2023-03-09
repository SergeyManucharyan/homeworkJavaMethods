package exception.extwo;

public class NotIntegerException extends Exception{
    @Override
    public String getMessage() {
        return "You can't set non-integer value";
    }
}
