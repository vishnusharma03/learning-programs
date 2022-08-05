package alpha;

import java.util.Arrays;

public class Leetcode645 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if (nums[correct] != nums[i]){
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            }else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j] - 1){
                ans[0] = nums[j];
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j] - 1){
                ans[1] = j + 1;
            }
        }
        return ans;

    }
}
