public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8, 9, 16, 17, 111, 1001, 1002, 2222, 3002, 3333};
        System.out.println(ans(arr, 3333));

    }
    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int newStart = end + 1;
            end = end + 2 * (end - start + 1);
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target < mid){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
