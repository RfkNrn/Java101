import java.util.Scanner;

public class ReversTriangle {
    public static void main(String[] args){
        System.out.print("Basamak Sayısı : ");
        int steps = new Scanner(System.in).nextInt();

        for(int i; steps > 0; --steps) {
            i = steps;

            while(i>0) {
                System.out.print("*");
                i--;
            }
            System.out.print("\n");
        }
    }
}
