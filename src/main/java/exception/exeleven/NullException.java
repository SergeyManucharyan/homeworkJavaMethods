package exception.exeleven;

public class NullException extends StringException{
    @Override
    public String getMessage() {
        return "String is null";
    }
}
