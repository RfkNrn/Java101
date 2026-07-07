import java.util.Scanner;

public class digitSum {
    public static void main(String[] args) {
        int num, result=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        num = input.nextInt();
        input.close();

        while(num > 0) {
            result+=num%10;
            num/=10;
        }

        System.out.println("Sayının basamakları toplamı: " + result);
    }
}
