package Assignments;

import java.util.Arrays;

public class ConcatanationOfArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,1};

        System.out.println(Arrays.toString(getConcatenation(arr1)));
    }
    public static int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] num2 = new int[2*size];
        int size2 = num2.length;

        for (int i = 0; i < size2; i++) {
            if (i < size){
                num2[i] = nums[i];
            }
            if (i >= size) {
                num2[i] = nums[i - nums.length];
            }
        }
        return num2;

    }
}
