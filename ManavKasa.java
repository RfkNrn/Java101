import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo? : ");
        armut *= input.nextInt();
        System.out.print("Elma kaç kilo? : ");
        elma *= input.nextInt();
        System.out.print("Domates kaç kilo? : ");
        domates *= input.nextInt();
        System.out.print("Muz kaç kilo? : ");
        muz *= input.nextInt();
        System.out.print("Patlıcan kaç kilo? : ");
        patlican *= input.nextInt();
        input.close();

        System.out.println("Toplam tutar : " + (armut + elma + domates + muz + patlican) + " TL");
    }
}
