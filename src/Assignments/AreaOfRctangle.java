package Assignments;

import java.util.Scanner;

public class AreaOfRctangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length & breath of rectangle: ");
        float l = in.nextInt();
        float b = in.nextInt();

        System.out.println(rectanglearea(l, b));

    }

    static float rectanglearea(float len, float bre){
        float area = len * bre;
        return area;
    }

}
