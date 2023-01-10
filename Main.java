public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 8, 9, 12, 33, 45, 56, 77};
        int target = 78;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }
    static int ceiling(int[] arr, int target){
        if(target > arr[arr.length - 1]){
            return  -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return arr[start];
    }
}