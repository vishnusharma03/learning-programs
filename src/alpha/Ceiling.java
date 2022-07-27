package alpha;

import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println("Enter the target: ");
        int target = in.nextInt();
        System.out.println(Binary1(arr, target));
    }

    public static int Binary1(int[] arr, int target){
        int fi = 0, pa = 0;
        int li = arr.length - 1;
        while(fi <= li){
            int mi = fi + (li - fi) / 2;
            if (target > arr[mi]) {
                fi = mi + 1;
            }
            else if (target < arr[mi]) {
                li = mi - 1;
            }
            else if (target == arr[mi]) {
                return mi;
            }
        }
        return fi;
    }
}
