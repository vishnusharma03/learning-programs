package alpha;

import java.util.Arrays;


public class PartiallySortedMatrix {

    public static void main(String[] args) {
        int[][] arr2D = {
                {10, 20, 30, 40},
                {11, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        System.out.println(Arrays.toString(search2D(arr2D, 35)));
    }

    public static int[] search2D(int[][] arr, int target){
        int rs = 0, ce = arr[0].length - 1;
        while(ce >= 0){
            if (arr[rs][ce] == target){
                return new int[]{rs, ce};
            }
            if (arr[rs][ce] > target){
                ce--;
            }else
                rs++;
        }
        return new int[] {-1,-1};
    }

}
