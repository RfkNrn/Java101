import java.util.Scanner;

public class findMaxMin {
    static void main() {
        int min=1, max=1, numCount, tempNum;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceğiniz yazın: ");
        numCount = input.nextInt();

        for (int i = 1; i <= numCount; i++) {
            while(true){
                System.out.print(i + ". sayıyı giriniz: ");
                tempNum = input.nextInt();
                if (tempNum<=0){
                    System.out.println("Girdiğiniz sayı bir sayma sayısı değildir!");
                    continue;
                }

                if (tempNum>max){max = tempNum;}
                if (i==1){
                    min = tempNum;
                } else {
                    if (tempNum<min){min = tempNum;}
                }
                break;
            }
        }
        input.close();

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}