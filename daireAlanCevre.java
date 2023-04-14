import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Daire yarıçapını yazınız: ");
        double r = new Scanner(System.in).nextDouble();

        System.out.println("Çevre: " + String.format("%.2f", 2*r*3.14) + "\nAlan: " + String.format("%.2f", Math.pow(r, 2)*3,14));
    }
}
