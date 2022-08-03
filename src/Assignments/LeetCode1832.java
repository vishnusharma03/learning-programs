package Assignments;

public class LeetCode1832 {
    public static void main(String[] args) {
        String word = "jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo";
        System.out.println(Pangram(word));
    }

    static boolean Pangram(String word) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] ch = new char[word.length()];
        if (word.length() < 26) {
            return false;
        } else {
            for (int i = 0; i < word.length(); i++) {
                ch[i] = word.charAt(i);
            }
            for (int i = 0; i < 26; i++) {
                int count = 0;
                for (int j = 0; j < word.length(); j++) {
                    if (alphabet[i] == ch[j]) {
                        count = 1;
                    }
                }
                if (count == 0){
                    return false;
                }
            }
            return true;
        }
    }
    // sample alternate optimised method;
    static boolean checkIfPangram(String sentence) {
        char[] ch = new char[sentence.length()];
        for (int i = 0; i < sentence.length(); i++) {
            ch[i] = sentence.charAt(i);
        }
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for(int i=0;i < sentence.length();i++){
            int temp = ch[i] - 'a';                //gives the value of indexes
            arr[temp]=1;                             //array fills value 1 at unique indexes
        }
        for(int j=0;j<26;j++){
            if(arr[j]==0){                           //check if any index value is 0 then false
                return false;
            }
        }
        return true;
    }
}
