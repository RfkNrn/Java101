import java.sql.SQLOutput;
import java.util.Scanner;

public class averageScore {
    static void main() {
        int mat, tur, kim, fiz, muz, total=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Notları giriniz");

        System.out.print("Matematik: ");
        mat = input.nextInt();
        if ((-1 < mat) && (mat < 101)) {
            total += mat;
        }

        System.out.print("Türkçe: ");
        tur = input.nextInt();
        if ((-1 < tur) && (tur < 101)) {
            total += tur;
        }

        System.out.print("Kimya: ");
        kim = input.nextInt();
        if ((-1 < kim) && (kim < 101)) {
            total += kim;
        }

        System.out.print("Fizik: ");
        fiz = input.nextInt();
        if ((-1 < fiz) && (fiz < 101)) {
            total += fiz;
        }

        System.out.print("Müzik: ");
        muz = input.nextInt();
        if ((-1 < muz) && (muz < 101)) {
            total += muz;
        }

        System.out.println("Ortalamanız: " + (total/5));
        if (total < 55) {
            System.out.println("Kaldınız :(");
        } else {
            System.out.println("Geçtiniz!");
        }
    }
}
