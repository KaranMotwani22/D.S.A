import java.util.function.BinaryOperator;

public class Recursion {
    public static void main(String[] args) {
//        message(5);
//        System.out.println(fibonacciNumber(5));
        int[] arr = {1, 11, 33, 44, 57, 89, 90, 101, 111};
        int ans =  binarySearch(arr, 01, 0, arr.length - 1);
        System.out.println(ans);
    }

    static void message(int n) {
        System.out.println("karan");
        n--;
        if (n > 0) {
            message(n);
        }
    }

    static int fibonacciNumber(int n) {
        if(n < 2){
            return n;
        }
        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);

    }
    static int binarySearch(int[] arr, int target, int start, int end){
        if(start > end){
            return - 1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        else if(target > arr[mid]){
            return binarySearch(arr, target, mid + 1, end);
        }
        else{
            return binarySearch(arr, target, start, mid - 1);
        }
    }
}
