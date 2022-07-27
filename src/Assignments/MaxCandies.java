package Assignments;

import alpha.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxCandies {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        int num = 3;
        System.out.println(kidsWithCandies(arr, num));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<Boolean>();
        for (int i = 0; i < candies.length; i++) {
            int max = Integer.MIN_VALUE;
            candies[i] += extraCandies;
            for (int j = 0; j < candies.length; j++) {
                if (candies[j] >= max) {
                    max = candies[j];
                }
            }
            if (max == candies[i]){
                ans.add(true);
            }else ans.add(false);
            candies[i] -= extraCandies;
        }
        return ans;
    }
}