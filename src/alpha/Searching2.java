package alpha;

import java.util.Scanner;

public class Searching2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = in.next();
        System.out.println("Enter the character: ");
        char target = in.next().charAt(0);

        System.out.println(search(word, target));

    }

    static boolean search(String wording, char character){
        if (wording.length() == 0)
            return false;
        for (char ch : wording.toCharArray()){
            if(ch == character){
                return true;
            }
        }
        return false;
    }
}
