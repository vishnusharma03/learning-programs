package alpha;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {78, 70, 69, 51, 42, 36, 21, 11, 0};
        System.out.println("Enter the target element: ");
        int target = in.nextInt();

        System.out.println(Bs(arr, target));
    }

    public static int Bs(int[] array, int target){
        int fi = 0;
        int li = array.length - 1;
        while(fi <= li){
            int mi = fi + (li - fi) / 2;
            if (target < array[mi]) {
                fi = mi + 1;
            }
            else if (target > array[mi]) {
                li = mi - 1;
            }
            else if (target == array[mi]) {
                return mi;
            }
        }
        return -1;
    }
}
