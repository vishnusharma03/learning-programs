package alpha;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        System.out.print("Enter your username: ");
        Scanner input = new Scanner(System.in);

        System.out.print("Hello " + input.nextLine() + ", We are glad to have you.");
    }
}
