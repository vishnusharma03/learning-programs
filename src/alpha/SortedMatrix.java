package alpha;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] array2D = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println(Arrays.toString(SortedSearch(array2D, 5)));
    }

    public static int[] SortedSearch(int[][] array2D, int target){
        int rs = 0, re = array2D.length, cs = 0, ce = array2D[0].length;
        int cm = ce  / 2;
        while(re > rs + 1) {
            int rm = rs + (re - rs) / 2;
            if (array2D[rm][cm] == target) {
                return new int[]{rm, cm};
            }
            if (array2D[rm][cm] > target) {
                re = rm;
            }
            if (array2D[rm][cm] < target) {
                rs = rm;
            }
        }
            if (array2D[rs][cm] == target){
                return new int[]{rs, cm};
            }
            if (array2D[rs+1][cm] == target){
                return new int[]{rs+1, cm};
            }

            if (array2D[rs][cm-1] >= target){
                return binarysearch(array2D, rs, target, 0, cm-1);
            }
            if (array2D[rs][cm+1] <= target && target <= array2D[rs][array2D[0].length - 1]){
                return binarysearch(array2D, rs, target, cm + 1, array2D[rs].length - 1);
            }
            if (array2D[rs + 1][cm -1] >= target){
                return binarysearch(array2D, rs + 1, target, 0, cm - 1);
            }
            else{
                return binarysearch(array2D, rs + 1, target, cm + 1, array2D[rs].length - 1);
            }
    }

    public static int[] binarysearch(int[][] arr,int row, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[row][mid]){
                return new int[]{row, mid};
            }
            if (target > arr[row][mid]){
                start = mid + 1;
            }
            if (target < arr[row][mid]){
                end = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
}
