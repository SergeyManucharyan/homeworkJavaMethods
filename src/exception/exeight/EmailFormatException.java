package exception.exeight;

public class EmailFormatException extends Exception{
    @Override
    public String getMessage() {
        return "Incorrect email format\n" +
                "example\n" +
                "Mail-06@gmail.com";
    }
}
