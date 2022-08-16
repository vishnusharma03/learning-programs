package alpha;

import java.util.Arrays;

public class ArrayOneNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4};
        System.out.println(Arrays.toString(bubblesort(arr)));
        System.out.println(lonelynumber(arr));
    }

    public static int lonelynumber(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[2 * i] != arr[(2 * i) + 1]){
                return arr[2 * i];
            }
            else return arr[arr.length - 1];
        }
        return 0;
    }

    public static int[] bubblesort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                }
            }
        }
        return arr;
    }
}
