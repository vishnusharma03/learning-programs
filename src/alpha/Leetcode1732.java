package alpha;

public class Leetcode1732 {
    public static void main(String[] args) {
       int[] gain = {52,-91,72};
        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {
        int[] ans = new int[gain.length + 1];
        for (int i = 0; i <= gain.length; i++) {
            if (i == 0) {
               ans[i] = 0;
            }
            else {
                ans[i] = gain[i - 1] + ans[i - 1];
            }
        }
        int max = ans[0];
        for (int an : ans) {
            if (an > max) {
                max = an;
            }
        }
        return max;
    }
}
