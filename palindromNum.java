import java.util.Scanner;

public class palindromNum {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();
        input.close();

        int digits = digitCount(number);
        if (digits == 1) {
            System.out.println(number + " palindrom bir sayıdır.");
        } else {
            if (isPalindrom(number, digits)) {
                System.out.println(number + " palindrom bir sayıdır.");
            } else {
                System.out.println(number + " palindrom bir sayı değildir.");
            }
        }
    }

    static int digitCount(int n) {
        if (n == 0) {return 1;}
        int result = 0;
        while (n != 0) {
            n /= 10;
            result++;
        }
        return result;
    }

    static boolean isPalindrom(int number, int digits) {
        int digitHalf = digits/2;
        for (int i = 1; i <= digitHalf; i++) {
            int digitLast = Math.powExact(10,(digits-1));
            int digitFirst = Math.powExact(10,i);
            digitFirst = (number%digitFirst)/(digitFirst/10);
            digitLast = (number/digitLast)%10;

            if(digitFirst != digitLast) {
                return false;
            }
            digits--;
        }
        return true;
    }
}