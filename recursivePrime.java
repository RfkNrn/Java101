import java.util.Scanner;

public class recursivePrime {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int i = input.nextInt();
        input.close();

        System.out.println(recPrime(i, i-1));
    }

    static String recPrime(int num, int div){
        if(div == 1)
            return num + " asal bir sayıdır.";
        else{
            if(num % div == 0)
                return num + " asal bir sayı değildir.";
            else
                return recPrime(num, div-1);

        }
    }
}