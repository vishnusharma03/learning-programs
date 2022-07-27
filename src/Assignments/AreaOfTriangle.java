package Assignments;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sides of triangle: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        System.out.println(trianglearea(num1, num2, num3));

    }

    static float trianglearea(int a, int b, int c) {
        float max = 0, min1 = 0, min2 = 0, area = 0;
        if (a > b && a > c) {
            max = a;
            min1 = b;
            min2 = c;
        } else if (b > a && b > c) {
            max = b;
            min1 = a;
            min2 = c;
        } else {
            max = c;
            min1 = a;
            min2 = b;
        }

        if ((min1 + min2) > max) {

            float s = a + b + c;
            area = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));

        }else System.out.println("Laude se trianle nhi banega.");
        return area;
    }
}
