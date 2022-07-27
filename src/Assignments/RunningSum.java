package Assignments;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr1 =  {12,42, 42, 24,232,3};
        System.out.println(Arrays.toString(runningSum(arr1)));
    }

    public static  int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                ans[i] += nums[j];
            }
        }
        return ans;
    }

}
