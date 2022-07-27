package Assignments;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        int rad = in.nextInt();

        System.out.println(cirlearea(rad));


    }

    static float cirlearea(int radius){
        float area = 0;
        if(radius == 0)
            System.out.println("betichoda, zero ka v circle hota hai?");
        else if (radius < 0) {
            System.out.println("A circle cannot be formed with the given rradius.");
        } else {
            area = (float) ((3.14) * radius * radius);

        }
        return area;
    }
}
