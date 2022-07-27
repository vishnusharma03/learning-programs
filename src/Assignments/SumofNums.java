package Assignments;

import java.util.Scanner;

public class SumofNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 0, sum = 0;

        do {
            System.out.println("Enter the number: ");
            num = in.nextInt();
            sum += num;
        }while (num != 0);

        System.out.println("Summation of entered is " + sum);
    }
}
