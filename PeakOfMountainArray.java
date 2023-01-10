public class PeakOfMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 7, 9, 10, 11, 12, 33, 44};
                int start = 0;
                int end = arr.length - 1;
                while(start < end){
                    int mid = start + (end - start)/2;
                    if(arr[mid] < arr[mid + 1]){
                        start = mid + 1;
                    }
                    else{
                        end = mid;
                    }
                }
        System.out.println(start);
            }
}
