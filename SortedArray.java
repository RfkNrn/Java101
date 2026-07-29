import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int arrayLength = input.nextInt();
        int[] array = new int[arrayLength];
        boolean zeroEntry = false;

        for(int i = 0; i < arrayLength; i++) {
            System.out.print((i+1) + ". Elemanı : ");
            int num = input.nextInt();
            if (num == 0) {
                zeroEntry = true;
                continue;
            }
            if (i==0)
                array[0] = num;
            else
                insertElement(array, num, indexToInsert(array, num));
            }

        if (zeroEntry)
            insertElement(array, 0, indexToInsert(array, 0));
        System.out.println("Sıralama : " + Arrays.toString(array));
    }

    static void insertElement(int[] array, int element, int index) {
        int moving_index = index;
        int tempNum = 0;
        while (moving_index+1 < array.length) {
            tempNum = array[moving_index+1];
            array[moving_index+1] = array[index];
            array[index] = tempNum;
            moving_index++;
        }

        array[index] = element;
    }

    static int indexToInsert (int[] array, int element) {
        for(int i = 0; i < array.length; i++) {
            if (element < array[i] || array[i] == 0)
                return i;
        }

        return array.length-1;
    }
}