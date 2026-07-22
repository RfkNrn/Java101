public class ArrayHarmonicAverage {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(harmonicAverage(numbers));
    }

    static double harmonicAverage(int[] array) {
        double result = 0.0;
        for(int i: array) {
            result += 1.0/i;
        }

        result = array.length/result;
        return result;
    }

}
