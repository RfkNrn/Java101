public class primeCounter {
    static void main() {
        System.out.print("2 3");

        int i = 5, j, primeTester;
        boolean primeFlag_i,  primeFlag_j;
        while (i + 2 < 100) {
            j = i + 2;
            primeFlag_i = primeFlag_j = true;

            if (i % 2 == 0 || i % 3 == 0) {
                primeFlag_i = false;
            } else {
                primeTester = 5;
                while (primeTester * primeTester <= i) {
                    if (i % primeTester == 0 || i % (primeTester + 2) == 0) {
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
                    if (j % primeTester == 0 || j % (primeTester + 2) == 0) {
                        primeFlag_j = false;
                    }
                    primeTester += 6;
                }
            }

            if (primeFlag_i) {System.out.print(" " + i);}
            if (primeFlag_j) {System.out.print(" " + j);}

            i += 6;
        }
    }
}
