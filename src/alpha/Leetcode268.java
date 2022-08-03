package alpha;

import java.util.Arrays;

public class Leetcode268 {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] array) {
        int i = 0;
        while(i < array.length) {
            int correct = array[i];

            if (correct < array.length) {

                if (array[correct] != array[i]) {
                    int temp = array[correct];
                    array[correct] = array[i];
                    array[i] = temp;
                } else {
                    i++;
                }
            }
            else i++;
        }

        for (int j = 0; j < array.length; j++) {
            if (j != array[j]){
                return j;
            }
        }

        return array.length;
    }
}

