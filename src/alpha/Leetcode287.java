package alpha;

public class Leetcode287 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));

    }

    public static int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[correct] != nums[i]) {
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            }
            else {
                i++;
            }
        }
        return nums[nums.length - 1];
    }
}
