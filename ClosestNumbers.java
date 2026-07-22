import java.util.Arrays;

public class ClosestNumbers {
    static void main() {
        int[] list = {15,12,788,1,-1,-778,2,0};
        System.out.println("Dizi : " + Arrays.toString(list));
        printClosestNumbers(list, 5);
    }

    static void printClosestNumbers(int[] array, int num){
        int small = array[0], large = array[0], smallDif = 0, largeDif = 0;

        for(int i: array){
            if (i < num){
                if (smallDif == 0){
                    smallDif = num-i;
                    small = i;
                } else if (smallDif>num-i) {
                    smallDif = num-i;
                    small = i;
                }
            } else if (i > num) {
                if (largeDif == 0){
                    largeDif = i - num;
                    large = i;
                } else if (largeDif > i-num) {
                    largeDif = i-num;
                    large = i;
                }
            }
        }

        System.out.println("Girilen sayı: " + num);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + small);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + large);
    }
}
