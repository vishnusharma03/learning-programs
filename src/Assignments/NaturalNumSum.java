package Assignments;

import java.util.Scanner;

public class NaturalNumSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the limit: ");
        int num = in.nextInt();

        System.out.println("Sum of first natural numbers is " + naturalsum(num));

    }

    static int naturalsum(int num){
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
           return sum;
        }
    }

