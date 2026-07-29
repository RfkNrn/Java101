import java.sql.SQLOutput;
import java.util.Arrays;

public class RepetitionCount {
    static void main() {

        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi : " + Arrays.toString(array));
        System.out.println("Tekrar Sayıları");
        Arrays.sort(array);

        int i = 0;
        while (i < array.length){
            int count = 1;
            int countedNum = array[i];
            while(i < array.length-1 && array[i] == array[i + 1]) {
                count++;
                i++;
            }

            System.out.println(countedNum + " sayısı " + count + " kere tekrar edildi");
            i++;
        }
    }
}
