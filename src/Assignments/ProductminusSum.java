package Assignments;

import java.util.Scanner;

public class ProductminusSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int rem = 0, product = 1, sum = 0;
        int dell = num;
        do{
            rem = num % 10;
            product = product * rem;
            sum += rem;
            num = num / 10;

        }while(num>0);

        int ans = product - sum;
        System.out.println(ans);

    }
}
