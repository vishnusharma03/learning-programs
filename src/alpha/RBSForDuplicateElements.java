package alpha;

public class RBSForDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1};
        int target = 1;
        System.out.println(search(arr, target));
    }

    public static int search(int[] nums, int target) {
        int pv = pivot(nums);
        System.out.println(pv);
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
        int max = arr[0];
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > max){
                max = arr[mid];
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
