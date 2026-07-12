import java.util.Scanner;

public class perfectNumber {
    static void main() {
        int num, totalDiv=0;
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("Bir sayı giriniz: ");
            num = input.nextInt();
            if (num<=1) {
                System.out.println("1'den büyük bir sayı giriniz!");
                continue;
            }
            break;
        }
        input.close();

        for(int i=1;i<num;i++) {
            if (num%i==0) {
                totalDiv += i;
            }
        }

        if (totalDiv==num) {
            System.out.println(num + " mükemmel bir sayıdır.");
        } else {System.out.println(num + " mükemmel bir sayı değildir.");}
    }
}