package alpha;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empID = in.nextInt();
        String department =in.next();


        switch (empID) {
            case 1 -> System.out.println("Kunal Kushwaha");
            case 2 -> System.out.println("Vishnu Sharma");
            case 3 -> {
                System.out.println("Employee Number 03.");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department.");
                }
            }
            default -> System.out.println("Invalid employee ID.");
        }
    }
}
