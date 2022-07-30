package alpha;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {1};
        int target = 1;
        System.out.println(search(arr, target));
    }

    public static int search(int[] nums, int target) {
        int pv = pivot(nums);
        if(pv == -1){
            return BinarySearch(nums, target, 0, nums.length - 1);
        }
        if(nums[pv] == target){
            return pv;
        }
        else if(target >= nums[0]){
            return BinarySearch(nums, target, 0 , pv-1);
        }
        return BinarySearch(nums, target, pv + 1, nums.length - 1);
    }

    public static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {

        while(start <= end) {

            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else
                return mid;
        }
        return -1;
    }
}