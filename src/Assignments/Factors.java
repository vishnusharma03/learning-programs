package Assignments;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                System.out.print(i + " ");
        }
    }
}
