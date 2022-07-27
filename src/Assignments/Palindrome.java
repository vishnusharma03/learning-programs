package Assignments;

import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();

        System.out.println(palindrome(num));
    }

    static boolean palindrome(int num){
       int temp = num, sum = 0, rem = 0;
       while (num > 0){
           rem = num % 10;
           sum = (sum * 10) + rem;
           num = num / 10;
       }
       if (temp == sum)
           return true;

       return false;
    }
}
