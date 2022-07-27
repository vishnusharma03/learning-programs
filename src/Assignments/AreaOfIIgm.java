package Assignments;

import java.util.Scanner;

public class AreaOfIIgm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height: ");
        int h = in.nextInt();
        System.out.println("Enter the base: ");
        int b = in.nextInt();
        int area = h * b;
        System.out.println("Area of the parallelogram is " + area);
    }
}
