package exception.exeleven;

public class EmptyException extends StringException{
    @Override
    public String getMessage() {
        return "Empty string";
    }
}
