package alpha;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ans = 0;

        while (true) {
            char op = input.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '%' || op == '/') {
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                }
            }
            else if (op == 'x' || op == 'X'){break;}
            else  {
                    System.out.println("Invalid operation.");


            }
            System.out.println(ans);
        }


    }
}