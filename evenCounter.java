import java.util.Scanner;

public class evenCounter {
    static void main() {
        int counter;
        Scanner input =  new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        counter = input.nextInt();
        input.close();

        for (int i = 1; i <= counter; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
