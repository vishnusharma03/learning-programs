package alpha;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of mname: ");
        int mname = in.nextInt();
        System.out.println("Enter the size of fname: ");
        int fname = in.nextInt();

        int[][] mnamendfname = new int[mname][fname];

        for (int row = 0; row < mname; row++) {

            for (int col = 0; col < fname; col++) {

                mnamendfname[row][col] = in.nextInt();
            }
        }

        for (int i = 0; i < mname; i++) {

            for (int j = 0; j < fname; j++) {

                System.out.print(mnamendfname[i][j] + " ");
            }
        }
    }
}
