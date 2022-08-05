package alpha;

public class Leetcode41 {
    public static void main(String[] args) {
       int[] nums = {1, 2, 0};
        System.out.println(findmissing(nums));
    }

 public static int findmissing(int[] nums){
    int i = 0;
        while(i < nums.length){
        int correct = nums[i] - 1;
        if(nums[i] > 0 && nums[i] < nums.length && nums[correct] != nums[i]){
            int temp = nums[i];
            nums[i] = nums[correct];
            nums[correct] = temp;
        }
        else{
            i++;
        }
    }
        for(int j = 1; j <= nums.length; j++){
        if(j != nums[j-1]){
            return j;
        }
    }
        return nums.length + 1;
    }
}
