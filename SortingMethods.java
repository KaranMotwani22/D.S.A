import java.util.Arrays;

public class SortingMethods {
    public static void main(String[] args) {
        int[] arr = {8, 7, 6, 5, 4, 3, 1, 0};
        int ans = missingNumber(arr);
        System.out.println(ans);
        System.out.println(Arrays.toString(arr));
    }
    static void SelectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            //find the max element in the remaining array and swap it with correct index
            int last = arr.length - 1 - i;
            int maxIndex = getMaxIndex(arr, 0, last);
            //now swap element at maxIndex with the element at last index
//            int temp = arr[last];
//            arr[last] = arr[maxIndex];
//            arr[maxIndex] = temp;
            swap(arr, last, maxIndex);
            }
        }
    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void BubbleSort(int[] arr){
        boolean swapped;
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j - 1]){
                   swap(arr, j, j - 1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void cycleSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, correct, i);
            }
            else{
                i++;
            }
        }
    }
    static int missingNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(correct < arr.length && arr[i] != arr[correct] ){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        for(int j = 0; j < arr.length; j ++){
            if(j != arr[j]){
                return j;
            }
        }
        return -1;
    }

}
