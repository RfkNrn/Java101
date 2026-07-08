import java.util.Scanner;

public class diamondWithAsterisks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Elmasın basamak sayısını giriniz: ");
        int basamak = scan.nextInt();
        scan.close();

        for (int i = 1; i <= basamak; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= ((basamak - i) / 2); j++) {
                    System.out.print(" ");
                }

                for (int l = 1; l <= i; l++) {
                    System.out.print("*");
                }

                for (int k = 1; k <= ((basamak - i) / 2); k++) {
                    System.out.print(" ");
                }

                System.out.println();
            }
        }

        for (int m = basamak-1; m > 0; m--) {
            if (m % 2 != 0) {
                for (int j = 1; j <= ((basamak - m) / 2); j++) {
                    System.out.print(" ");
                }

                for (int l = 1; l <= m; l++) {
                    System.out.print("*");
                }

                for (int k = 1; k <= ((basamak - m) / 2); k++) {
                    System.out.print(" ");
                }

                System.out.println();
            }
        }
    }
}