package alpha;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String random1 = in.next();
        char[] find1 = new char[]{'a', 'i', 'o', 'u', 'e', 'A', 'I', 'O', 'U', 'E'};

        random(random1, find1);

    }

    static void random(String arr, char[] find) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < arr.length(); j++) {
                if (find[i] == arr.charAt(j)) {
                    System.out.println("The word contains vowels");
                    break;
                }
            }

        }

    }
}
