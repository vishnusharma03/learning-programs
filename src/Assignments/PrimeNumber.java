package Assignments;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to check if it is prime: ");
        int num = in.nextInt();

        System.out.println(prime(num));

    }

    static boolean prime (int num){
        for (int i = 2; (i*i) < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
