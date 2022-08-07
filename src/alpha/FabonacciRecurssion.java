package alpha;

public class FabonacciRecurssion {
    public static void main(String[] args) {
        Fab(9);
    }
    public static void Fab(int n){
        int fab0 = 0;
        int fab1 = 1;
        int count = 0;
        fabonacci(n, fab0, fab1, count);
    }

    private static void fabonacci(int n, int fab0, int fab1, int count) {

        if(count > n){
            return;
        }
        System.out.println(fab0);
        int t = fab0;
        fab0 = fab1;
        fab1 = fab0 + t;
        count++;
        fabonacci(n, fab0, fab1, count);
    }
}
