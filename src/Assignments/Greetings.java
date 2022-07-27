package Assignments;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = in.nextLine();

        System.out.println("Hello " + name + " Welcome to earth.");
    }
}
