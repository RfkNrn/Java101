import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("KDV'siz fiyatı giriniz: ");
        float fiyat = input.nextFloat();
        input.close();

        String kdvli = String.format("%.2f", (fiyat*1.18));
        String kdv = String.format("%.2f", (fiyat*0.18));

        System.out.println("KDV'siz fiyat: " + fiyat);
        System.out.println("KDV'li fiyat: " + kdvli);
        System.out.println("KDV tutarı: " + kdv);
    }
}
