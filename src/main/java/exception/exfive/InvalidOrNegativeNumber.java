package exception.exfive;

public class InvalidOrNegativeNumber extends Exception{
    @Override
    public String getMessage() {
        return "Invalid or negative number";
    }
}
