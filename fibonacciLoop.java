import java.util.Scanner;

public class fibonacciLoop {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fibonicci serisi için eleman sayısı girin: ");
        int num = sc.nextInt();
        sc.close();

        System.out.print(num + " Elemanlı Fibonacci Serisi :");

        int tempNum, i = 0, j = 1;
        for(int k = 1; k < num; k++){
            if (k == 1) {System.out.print(" " + i);}
            System.out.print(" " + j);
            tempNum = j;
            j = tempNum + i;
            i = tempNum;
        }
    }
}
