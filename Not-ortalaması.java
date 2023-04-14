import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fiz, tur;

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fiz = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        tur = input.nextInt();

        double ortalama = (mat + fiz + tur) / 3;
        String sonuc = ortalama >= 60 ? "Geçtiniz" : "Kaldınız";
        System.out.println("Ortalama: " + ortalama);
        System.out.println(sonuc);
    }
}
