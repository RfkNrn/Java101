import  java.util.Scanner;

public class combination {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Küme eleman sayısı giriniz: ");
        int n = input.nextInt();
        System.out.print("Kombinasyon sayısı giriniz: ");
        int r = input.nextInt();
        input.close();

        int combFact = 1, combMinusFact=1, factTotal = 1;

        for(int i=1; i<=n; i++) {
            factTotal *= i;

            if (r==i) combFact = factTotal;
            if ((n-r)==i) combMinusFact = factTotal;
        }

        System.out.println(n + " elemanlı bir kümenin " + r + " elemanlı konbinasyonları " + (factTotal/(combFact*combMinusFact)) + " tanedir.");
    }
}
