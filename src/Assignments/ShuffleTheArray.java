package Assignments;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] random = {1,3,5,7,2,4,6,8};
        System.out.println(Arrays.toString(shuffle(random,random.length)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            if ((i | 1) > i){
            ans[i] = nums[c];
            }
            else {
            ans[i] = nums[(n/2) + c];
            c++;
            }
        }

        return ans;
    }


}
