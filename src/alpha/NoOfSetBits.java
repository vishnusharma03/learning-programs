package alpha;

public class NoOfSetBits {
    public static void main(String[] args) {
     int num = 99;
     System.out.println(method2(num));

    }
    public static int method1(int num){
        int count = 0;
        while(num > 0){
            if ((num & 1) == 1){
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    public static int method2(int num){
        int count = 0;
        while(num > 0){
            int x = num & (-num);
            num -= x;
            count++;
        }
        return count;
    }
}
