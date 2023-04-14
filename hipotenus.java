import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("a kenarını giriniz: ");
        a = input.nextInt();
        System.out.print("b kenarını giriniz: ");
        b = input.nextInt();
        input.close();

        System.out.println("Hipotenüz uzunluğu: " + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }
}
