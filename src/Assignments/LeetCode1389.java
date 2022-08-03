package Assignments;

import java.util.Arrays;

public class LeetCode1389 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[] in = {0,1,2,2,1};
        System.out.println(Arrays.toString(target(arr, in)));
    }

    public static int[] target(int[] nums, int[] index){
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (index[i] < i){
                if (nums.length - 1 - index[i] >= 0)
                    System.arraycopy(target, index[i], target, index[i] + 1, nums.length - 1 - index[i]);
            }
            target[index[i]] = nums[i];
        }
        return target;
    }
}