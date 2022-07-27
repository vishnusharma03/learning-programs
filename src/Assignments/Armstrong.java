package Assignments;

import java.beans.PropertyEditorManager;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        int lambda = num;
        int sum = 0, rem = 0, cube = 0;
        do{
            rem = num % 10;
            cube = rem * rem * rem;
            sum += cube;
            num = num / 10;

        }while(num>0);

        if (sum == lambda)
            System.out.println("Number is armstrong.");
        else System.out.println("Number is not armstrong.");

    }
}
