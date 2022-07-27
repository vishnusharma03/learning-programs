package alpha;

public class Doagain {
    public static void main(String[] args) {
        int[][] richie = {
                {3, 83, 54, 1, 5},
                {4, 2, 99},
                {65, -1, -45, 54},
                {5, 25}
        };

        int ans = wealth(richie);
        System.out.println(ans);
    }

    static int wealth(int[][] rich) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < rich.length; person++) {
            int sum = 0;
            for (int bank = 0; bank < rich[person].length; bank++) {
                sum += rich[person][bank];
            }

            if (sum > ans)
                ans = sum;

        }
        return ans;
    }
}

