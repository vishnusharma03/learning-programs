package Assignments;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two numbers to be added: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println("Summation of these numbers will be " + summation(num1, num2));
    }

    static int summation(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
}
