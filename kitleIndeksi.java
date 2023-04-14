import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kilo, boy;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();
        input.close();

        System.out.println("Vücut Kitle İndeksiniz : " + String.format("%.2f", (kilo/Math.pow(boy, 2))));
    }
}
