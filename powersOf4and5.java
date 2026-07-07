import  java.util.Scanner;

public class powersOf4and5 {
    public static void main(String[] args) {
        int num, counter4 = 0, counter5 = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        num = input.nextInt();
        input.close();

        while(Math.powExact(4, counter4) < num) {
            if(counter4==0) {
                System.out.print("4'ün kuvvetleri: 0");
            } else {
                System.out.print(", " + (Math.powExact(4, counter4)));
            }

            counter4++;
        }

        System.out.println();

        while(Math.powExact(5, counter5) < num) {
            if(counter5==0) {
                System.out.print("5'in kuvvetleri: 0");
            }  else {
                System.out.print(", " + (Math.powExact(5, counter5)));
            }

            counter5++;
        }
    }
}
