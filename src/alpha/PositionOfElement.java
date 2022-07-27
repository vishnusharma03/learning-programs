package alpha;

import java.util.Arrays;

public class PositionOfElement {
    public static void main(String[] args) {
        int[] arr = {1};
        int target = 1;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int ia = answer(nums, target, true);
        int fa = answer(nums, target, false);
        ans[0] = ia;
        ans[1] = fa;
        return ans;
    }

    public static int answer(int[] nums, int target, boolean firstindex) {
        int fi = 0, li = nums.length - 1;
        int rdm = -1;
        while (fi <= li) {
            int mi = fi + (li - fi) / 2;
            if (target > nums[mi]) {
                fi = mi + 1;
            } else if (target < nums[mi]) {
                li = mi - 1;
            } else {
                rdm = mi;
                if (firstindex) {
                    li = mi - 1;
                } else
                    fi = mi + 1;
            }
        }
        return rdm;
    }
}