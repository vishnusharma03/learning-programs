package alpha;

public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {3,5,3,2,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else
                start = mid + 1;
        }
        return start;
    }
}
