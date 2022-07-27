package Assignments;

import java.util.Scanner;

public class GreaterNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        if (n1 > n2){
            System.out.println("Greater Number is " + n1);
        } else System.out.println("Greater Number is " + n2);
    }
}
