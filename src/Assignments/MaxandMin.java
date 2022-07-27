package Assignments;

import java.util.Scanner;

public class MaxandMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        Maxmin1(num1, num2, num3);
        Maxmin2(num1, num2, num3);
    }

    static void Maxmin1(int a, int b, int c){
        int max = 0;
        if(a > b){
            max = a;
        }
        else max = b;

        if (max > c)
            max = max;
        else max =c;

        System.out.println("Maximum of the three is " + max);

    }

    static void Maxmin2(int a, int b, int c){
        if (a >= b && a >= c)
            System.out.println( a + " is the maximum number.");
        else if (b >= a && b >= c)
            System.out.println( b + " is the maximum number.");
        else
            System.out.println( c + " is the maximum number.");
    }
}
