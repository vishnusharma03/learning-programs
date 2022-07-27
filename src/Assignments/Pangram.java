package Assignments;

public class Pangram {
    public static void main(String[] args) {
        String name = "leetcode";
        System.out.println(checkIfPangram(name));
    }
    public static boolean checkIfPangram(String sentence) {
        boolean[] boo = new boolean[26];
        int in = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if ('A' <= sentence.charAt(i) && sentence.charAt(i) <= 'Z')
                in = sentence.charAt(i) - 'A';
            else if ('a' <= sentence.charAt(i) && sentence.charAt(i) <= 'z')
                in = sentence.charAt(i) - 'a';
            else
                continue;
            boo[in] = true;
        }
        for (int i = 0; i <= 25; i++)
            if (!boo[i])
                return (false);
        return (true);
    }
}
