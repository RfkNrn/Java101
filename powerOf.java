import java.util.Scanner;

public class powerOf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, k;

        System.out.print("Taban değeri giriniz: ");
        n = input.nextInt();
        System.out.print("Üs değeri giriniz: ");
        k = input.nextInt();
        input.close();

        int powerOfN = 1;

        if (k > 0) {
            for(int i=1; i<=k; i++) {
                powerOfN *= n;
            }
        }

        System.out.println(n + "'in " + k + ". dereceden kuvveti: " + powerOfN + "'dir.");
    }
}
