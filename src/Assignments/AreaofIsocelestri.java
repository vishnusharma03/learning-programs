package Assignments;

import java.util.Scanner;

public class AreaofIsocelestri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of equal length: ");
        double side = in.nextInt();
        System.out.println("Enter the base: ");
        double base = in.nextInt();
        double height = Math.sqrt((side * side) - ((base * base) / 4));
        double halfarea = base * height;
        double area = halfarea / 2;
        System.out.println(halfarea);
        System.out.println(height);
        System.out.println(base);
        System.out.println(side);
        System.out.println("Area of the triangle " + area);
    }
}

