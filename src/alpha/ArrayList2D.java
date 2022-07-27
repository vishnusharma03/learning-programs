package alpha;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = in.nextInt();

        ArrayList<ArrayList<Integer>> twodarr = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            twodarr.add(new ArrayList<>());
        }

        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                twodarr.get(i).add(in.nextInt());
            }
        }

        System.out.println(twodarr);
    }
}
