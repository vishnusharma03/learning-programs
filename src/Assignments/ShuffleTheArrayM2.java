package Assignments;

import java.util.Arrays;

public class ShuffleTheArrayM2 {
    public static void main(String[] args) {
        int[] random = {1,3,5,7,2,4,6,8};
        System.out.println(Arrays.toString(shuffle(random,(random.length)/2)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int c = 0;
        for (int i = 0; i < 2*n; i++) {
            if ((i | 1) > i){
                ans[i] = nums[c];
            }
            else {
                ans[i] = nums[n + c];
                c++;
            }
        }

        return ans;
    }
}
