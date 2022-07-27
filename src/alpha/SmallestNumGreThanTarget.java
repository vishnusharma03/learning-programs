package alpha;

public class SmallestNumGreThanTarget {
    public static void main(String[] args) {
        char[] arr = {'e','e','e', 'n','n','n'};
        char target = 'f';
        System.out.println(letter(arr, target));
    }

    public static char letter(char[] letters, char target){
        int fi = 0, li = letters.length - 1;
        if (target >= letters[li]){
            return letters[0];
        }

        while(fi <= li){
            int mi = fi + (li - fi) / 2;
            if (target > letters[mi]){
                fi = mi + 1;
            } else if (target < letters[mi]) {
                li = mi - 1;
            }
            else if(target == letters[mi])
                while (letters[mi] == letters[mi+1]){mi += 1;}
            return letters[mi + 1];
        }
        return letters[fi];
    }
}

