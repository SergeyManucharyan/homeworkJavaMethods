package exception.exeleven;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Method strMethod = new Method();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
//       str=null;
        try {
            if (str == null) {
                throw new NullException();
            }
            if (str.trim().length() == 0) {
                throw new EmptyException();
            }
            System.out.println(str.toUpperCase());
            System.out.println(strMethod.vowelCount(str));
            System.out.println(strMethod.reverse(str));
        } catch (StringException e) {
            e.printStackTrace();
        }
    }
}
