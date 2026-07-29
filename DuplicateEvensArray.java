import java.lang.reflect.Array;
import java.util.Arrays;

public class DuplicateEvensArray {
    static void main() {
        int[] array = {8, 9, 2, 1, 3, 8, 9, 2, 4, 8};
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);

        for (int i=0; i<array.length; i++) {
            boolean isDuplicate = false;
            while (i < array.length-1 && array[i] == array[i+1]) {
                if(array[i]%2 == 0){
                    isDuplicate = true;
                }

                i++;
            }

            if(isDuplicate) {
                System.out.println(array[i]);
            }
        }
    }
}