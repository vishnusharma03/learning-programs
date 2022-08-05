package alpha;

public class StringsPalindrome {
    public static void main(String[] args) {
        String name = "";
        System.out.println(Palindrome(name));
    }

    public static boolean Palindrome(String name){
        if (name.length() == 0){
            return true;
        }
        int i = 0;
        while (i <= name.length() / 2){
            if (name.charAt(i) != name.charAt(name.length() - 1 - i)){
                return false;
            }
            else i++;
        }
        return true;
    }
}
