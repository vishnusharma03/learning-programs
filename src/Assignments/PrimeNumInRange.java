package Assignments;

import java.util.Scanner;

public class PrimeNumInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter intial & final range respectively: ");
        int initial = in.nextInt();
        int end = in.nextInt();


        int flag;
        for (int i = initial; i <= end; i++){

            if (i == 1 || i == 0)
                continue;

            flag = 1;

            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }

            }
            if (flag == 1)
                System.out.print(i + " ");
        }

    }

}

