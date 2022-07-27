package alpha;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the size of array: ");
            int arrsize = in.nextInt();
            System.out.println("Enter the elements of array: ");
            int[] firstarray = new int[arrsize];

            for (int i = 0; i < firstarray.length ; i++) {
                firstarray[i] = in.nextInt();
            }

            System.out.println("Method 1");
            for (int i = 0; i < firstarray.length ; i++) {
                System.out.print(firstarray[i] + " ");
            }

            System.out.println("");
            System.out.println("Method 2");
            for (int j : firstarray) {
                System.out.print(j + " ");
            }

            System.out.println("");
            System.out.println("Method 3");
            System.out.println(Arrays.toString(firstarray));
        }

    }



