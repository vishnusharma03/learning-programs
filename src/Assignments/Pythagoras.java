package Assignments;

import java.util.Scanner;

public class Pythagoras {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        System.out.println(pythagoras(n1,n2,n3));

    }

    static boolean pythagoras(int a, int b, int c){
        int max = 0, min1 = 0, min2 = 0;
        if (a >= b && a >= c) {
            max = a;
            min1 = b;
            min2 = c;
        }
        else if (b >= a && b >= c) {
            max = b;
            min1 = a;
            min2 = c;
        }
        else {
            max = c;
            min1 = b;
            min2 = a;
        }

        if ((max * max) == ((min1 * min1) + (min2 * min2))){
            return true;
        }
        return false;
    }
}
