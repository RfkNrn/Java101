import java.util.Scanner;

public class fibRecursive {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Fibonacci serisi için bir sayı giriniz: ");
        int n = scan.nextInt();
        scan.close();

        for (int i = 0; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 2) + fib(n - 1);
        }
    }
}