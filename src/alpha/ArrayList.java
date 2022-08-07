package alpha;

import java.util.Scanner;

public class ArrayList<I extends Number> {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        java.util.ArrayList<Integer> arrlst1 = new java.util.ArrayList<Integer>();

        System.out.println("Enter the number of items you wanna store: ");
        int size = in.nextInt();
        System.out.println("Enter the items: ");

        for (int index = 0; index < size; index++) {
            arrlst1.add(in.nextInt());
        }
        for (int index = 0; index < size; index++) {
            System.out.println(arrlst1.get(index));
        }

    }
}
