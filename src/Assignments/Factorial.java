package Assignments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();

        System.out.println("Factorial is " + factorial(num));
    }

    static int factorial(int num){
        if(num == 1 || num ==0)
            return 1;

        int fac = 1;
        for (int i = 1; i <= num; i++) {
            fac *= i;
        }
        return fac;

    }
}
