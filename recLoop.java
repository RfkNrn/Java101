import java.util.Scanner;

public class recLoop {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int i = input.nextInt();
        System.out.print("Çıktısı: ");
        Loop(i, i);
        input.close();
    }

    static void Loop(int num, int numReverse){
        if (num <= 0){
            reverseLoop(numReverse, num);
        } else {
            System.out.print(num + " ");
            Loop(num - 5, numReverse);
        }
    }

    static void reverseLoop(int num, int bottom){
        if (bottom == num){
            System.out.print(bottom);
        } else {
            System.out.print(bottom + " ");
            reverseLoop(num, bottom+5);
        }
    }
}