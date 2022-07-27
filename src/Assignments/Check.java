package Assignments;

import java.util.Arrays;

public class Check {
    public static void main(String[] args) {
        int[] arr= {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(arr, index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            target[i] = index[nums[i]];
        }
        return target;
    }

}
