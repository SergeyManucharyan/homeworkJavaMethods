import java.util.Scanner;
public class NPowNNotation {
    static  int count=1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n...");
        double n= sc.nextDouble();
        double m=n;
        n=Math.pow(n,n-1);
        recursion(n,m);
    }
    public static void recursion(double n, double m){

        if(n<1){
            return;
        }
        for (int i = 0; i < m; i++) {
            System.out.println(count+++" I'm not left out");
        }
        recursion(n-1,m);
    }
}
