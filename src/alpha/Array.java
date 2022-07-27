package alpha;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> name = new ArrayList<>(5);

        for (int i = 0; i < 3; i++) {
            name.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                name.get(i).add(in.nextInt());
            }
        }
        System.out.println(name);
    }
}