package Assignments;

import java.util.Scanner;

public class Fabbonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();
        int c = 2;
        int a = 0;
        int b = 1;
        System.out.print("0 1 ");
        while (c != n){

            int i = a + b;
            a = b;
            b = i;
            System.out.print(i + " ");
            c++;
        }
    }
}
