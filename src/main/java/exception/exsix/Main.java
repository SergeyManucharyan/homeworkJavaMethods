package exception.exsix;

/**
 * Create three new types of exceptions. Write a method that throws all three. In main(),
 * call the method but only use a single catch clause that will catch all three types of exceptions.
 */
public class Main {
    public static void throwException() throws AllException {
        int n = 5, k = 2;
        if (k == 0) {
            throw new DivideException();
        }
        System.out.println(n / k);
        String str = null;
        if (str == null) {
            throw new NullException();
        }
        System.out.println(str.length());
        String s = "STRING";
        if (s.length() < 10) {
            throw new OutOfBoundException();
        }
        System.out.println(s.charAt(10));
    }

    public static void main(String[] args) {
        try {
            throwException();
        } catch (AllException e) {
            System.out.println(e.getMessage());
        }
    }
}
