package alpha;

import java.util.Arrays;
import java.util.Scanner;

public class Searching3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter row size: ");
        int rs = in.nextInt();
        System.out.println("Enter column size: ");
        int cs = in.nextInt();
        int[][] array2D = new int[rs][cs];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < rs; i++) {
            for (int j = 0; j < cs; j++) {
                array2D[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter the target value: ");
        int tar = in.nextInt();

        int[] ans = search2D(array2D, tar);
        System.out.println(Arrays.toString(ans));

    }

    static int[] search2D(int[][] arr, int target){

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }

}
