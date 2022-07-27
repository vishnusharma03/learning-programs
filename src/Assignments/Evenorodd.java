package Assignments;

import java.util.Scanner;

public class Evenorodd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n1 = in.nextInt();
        if (n1 % 2 == 0) {
            System.out.println("Entered number is even.");
        } else {
            System.out.println("Entered number is odd.");
        }


    }
}