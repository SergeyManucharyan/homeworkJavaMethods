package enumexercisetwo.exerciseone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ChangeLight c = new ChangeLight();
        Scanner sc = new Scanner(System.in);
        System.out.println("Red - 1");
        System.out.println("Yellow - 2");
        System.out.println("Green - 3");
        int start= sc.nextInt();
        switch (start){
            case 1: c.changing(Traffic.RED);
                break;
            case 2: c.changing(Traffic.YELLOW);
                break;
            case 3:c.changing(Traffic.GREEN);
                break;
            default:
                System.out.println("wrong input");
        }
    }
}
