package Assignments;

public class WealthComparison {
    public static void main(String[] args) {
        int[][] arr2 = {{1,2,3},
                        {4,3,1},
                        {32,23,2}
        };

        System.out.println(wealth(arr2));
    }

    static int wealth(int[][] accounts){

        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if(ans < sum) {
                ans = sum;
            }

        }
        return ans;
    }
}
