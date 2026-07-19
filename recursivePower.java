import java.util.Scanner;

public class recursivePower {
    static void main() {
        int i, k;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        i = input.nextInt();
        System.out.print("Üs değerini giriniz ");
        k = input.nextInt();
        input.close();

        System.out.println("Sonuç: " + recPow(i, k));
    }

    static int recPow(int base, int pow) {
        if (pow == 0) {
            return 1;
        } else if (pow == 1) {
            return base;
        } else {
            return base * recPow(base, pow - 1);
        }
    }
}
