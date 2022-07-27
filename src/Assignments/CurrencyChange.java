package Assignments;

import java.util.Scanner;

public class CurrencyChange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input Currency in rupees: ");
        int n1 = in.nextInt();
        int USD = n1 * 75;
        System.out.println("Equivalent money in USD is " + USD);
    }
}
