package Assignments;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int sum = 0;
        System.out.println("Enter operand: ");
        char op = in.next().trim().charAt(0);

        if(op == '*' || op == '+' || op == '-' || op == '/' || op == '%'){

            if (op == '*'){
                sum = n1 * n2;
            }
            else if (op == '+'){
                sum = n1 + n2;
            }
            else if (op == '%'){
                sum = n1 % n2;
            }
            else if (op == '-'){
                sum = n1 - n2;
            }
            else if (op == '/'){
                if (n2 !=0) {
                    sum = n1 / n2;
                }else System.out.println("Can't divide by zero.");
            }
            else {System.out.println("Invalid Operand.");}

            System.out.println("Answer is " + sum);
        }

    }
}
