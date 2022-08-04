package alpha;

import java.util.ArrayList;
import java.util.List;

public class Leetcode448 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
                    if (correct <= nums.length && nums[correct] != nums[i]) {
                    int temp = nums[correct];
                    nums[correct] = nums[i];
                    nums[i] = temp;
                }
                else {
                    i++;
                }
        }
        for (int j = 0; j < nums.length; j++) {
            if (j  != nums[j] - 1){
                ans.add(j + 1);
            }
        }
        return ans;
    }
}

