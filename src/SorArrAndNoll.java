import java.lang.reflect.Array;
import java.util.Arrays;

public class SorArrAndNoll {
    public static void main(String[] args) {
        int[] arr = {1,3,5,0,7,3,0,1,3,6,7,0,0,0,};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if ((array[j - 1] > array[j])) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
                if (array[j - 1] == 0 ) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
