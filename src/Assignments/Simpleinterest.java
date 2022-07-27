package Assignments;

import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Program to find Simple Interest.");
        System.out.println("Enter principal: ");
        int principal = in.nextInt();
        System.out.println("Enter Rate: ");
        int Rate = in.nextInt();
        System.out.println("Enter time: ");
        int time = in.nextInt();

        int SI = (principal * Rate * time)/100;

        System.out.println("Simple interest will be " + SI);
    }
}
