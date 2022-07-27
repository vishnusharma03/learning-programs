package Assignments;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks = in.nextInt();

        System.out.println("Your Grade is " + grade(marks));

    }

    static String grade(int num){
        if (num > 90 && num <=100)
            return "AA";
        if (num > 80 && num <=90)
            return "AB";
        if (num > 70 && num <=80)
            return "BB";
        if (num > 60 && num <=70)
            return "BC";
        if (num > 50 && num <=60)
            return "CD";
        if (num > 40 && num <=50)
            return "DD";
        if(num <= 40 && num >=0)
            return "Fail";
        return "Invalid Input.";
    }
}
