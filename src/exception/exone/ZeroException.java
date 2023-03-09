package exception.exone;

public class ZeroException extends Exception{

    @Override
    public String getMessage() {
        return "Number can't be zero";
    }
}
