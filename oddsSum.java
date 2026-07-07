import java.util.Scanner;

public class oddsSum {
    static void main() {
        int n, sum=0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Bir tamsayı giriniz: ");
            n = input.nextInt();
            if (n%2==1) {
                sum+=n;
            }
        } while (n>=0);

        System.out.println("Toplam: " + sum);
        input.close();
    }
}
