import java.util.Scanner;

public class EbobEkok {
    static void main() {

        int a, b, temp_a, temp_b, EKOK, EBOB = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        a = input.nextInt();
        System.out.print("Diğer sayıyı giriniz: ");
        b = input.nextInt();
        input.close();

        temp_a = a;
        temp_b = b;

        while (true) {
            if (a % 2 == 0 && b % 2 == 0) {
                EBOB *= 2;
                a /= 2;
                b /= 2;
            } else if (a % 2 == 0) {
                a  /= 2;
            } else if (b % 2 == 0) {
                b /= 2;
            } else  {break;}
        }

        while (true) {
            if (a % 3 == 0 && b % 3 == 0) {
                EBOB *= 3;
                a /= 3;
                b /= 3;
            } else if (a % 3 == 0) {
                a  /= 3;
            } else if (b % 3 == 0) {
                b /= 3;
            } else   {break;}
        }

        int i = 5, j, primeTester;
        boolean primeFlag_i,  primeFlag_j;
        while (a != 1 && b != 1) {
            j = i + 2;
            primeFlag_i = primeFlag_j = true;

            if (i % 2 == 0 || i % 3 == 0) {
                primeFlag_i = false;
            } else {
                primeTester = 5;
                while (primeTester * primeTester <= i) {
                    if (i % primeTester == 0 || i % primeTester + 2 == 0) {
                        primeFlag_i = false;
                    }
                    primeTester += 6;
                }
            }

            if(j % 2 == 0 || j % 3 == 0) {
                primeFlag_j = false;
            } else {
                primeTester = 5;
                while (primeTester * primeTester <= j) {
                    if (j % primeTester == 0 || j % primeTester + 2 == 0) {
                        primeFlag_j = false;
                    }
                    primeTester += 6;
                }
            }

            if (primeFlag_i) {
                if (a % i == 0 && b % i == 0) {
                    EBOB *= i;
                    a /= i;
                    b /= i;
                    continue;
                } else if (a % i == 0) {
                    a /= i;
                    continue;
                } else if (b % i == 0) {
                    b /= i;
                    continue;
                }
            }

            if (primeFlag_j) {
                if (a % j == 0 && b % j == 0) {
                    EBOB *= j;
                    a /= j;
                    b /= j;
                    continue;
                } else if (a % j == 0) {
                    a /= j;
                    continue;
                } else if (b % j == 0) {
                    b /= j;
                    continue;
                }
            }

            i += 6;
        }

        if (EBOB != 1) {
            EKOK = (temp_a * temp_b)/ EBOB;
            System.out.println("İki sayının EBOB'u: " + EBOB);
        } else {
            EKOK = (temp_a * temp_b);
            System.out.println("İki sayı aralarında asaldır.");
        }
        System.out.println("İki sayının EKOK'u: " + EKOK);
    }
}
