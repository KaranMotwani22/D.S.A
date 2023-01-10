import java.util.ArrayList;
import java.util.List;

class missingNumbers {
    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 7, 1, 9};
        System.out.println(findDisappearedNumbers(arr));
    }

    static List<Integer> findDisappearedNumbers(int[] arr) {
            int i = 0;
            List<Integer> list = new ArrayList<>();
            while(i < arr.length){
                int correct = arr[i] - 1;
                if(correct < arr.length && arr[i] != arr[correct]){
                    swap(arr, i, correct);
                }
                else{
                    i++;
                }

            }
        for(int j = 0; j < arr.length; j++){
            if(j != arr[j] - 1){
                list.add(j + 1);
                
            }
        }
        return list;
        
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}