import java.util.Scanner;

public class numberOrder {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("a: ");
        a = input.nextInt();
        System.out.print("b: ");
        b = input.nextInt();
        System.out.print("c: ");
        c = input.nextInt();

        input.close();

        if (a>b) {
            if (c>a) {
                System.out.println("c > a > b");
            } else if (b > c) {
                System.out.println("a > b > c");
            } else  {
                System.out.println("a > c > b");
            }
        } else {
            if (c>b) {
                System.out.println("c > b > a");
            } else if (a > c) {
                System.out.println("b > a > c");
            }  else  {
                System.out.println("b > c > a");
            }
        }
    }
}
