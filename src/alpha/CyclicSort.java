package alpha;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        System.out.println(Arrays.toString(ApplyCyclicSort(arr)));
    }

    public static int[] ApplyCyclicSort(int[] array) {

       int i = 0;
       while(i < array.length){
           int correct = array[i] - 1;
           if (array[correct] != array[i]){
               int temp = array[correct];
               array[correct] = array[i];
               array[i] = temp;
           }else {
               i++;
           }
       }
       return array;
    }
}
