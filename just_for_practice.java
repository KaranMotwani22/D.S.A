
import java.util.Arrays;

public class just_for_practice {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(Search2DArray(arr, 9)));


    }
    static int[] Search2DArray(int[][] arr, int target){
        int rows = arr.length;
        int cols = arr[0].length;
         if(rows == 1){
             return BinarySearchHelpIn2DArray(arr, 0, 0, cols - 1, target);
         }
         int rStart = 0;
         int rEnd = rows - 1;
         int cMid = cols / 2;
         while (rStart < (rEnd - 1)){
             int rMid = rStart + (rEnd - rStart) / 2;
             if(arr[rMid][cMid] == target){
                 return new int[]{rMid, cMid};
             }
             else if(arr[rMid][cMid] < target){
                 rStart = rMid;
             }
             else{
                 rEnd = rMid;
             }
         }
         // now we have two rows
        //Apply binary search in 2 rows
        if(target < arr[rStart+1][0]){
           return BinarySearchHelpIn2DArray(arr, rStart, 0, cols - 1, target);
        }
        else{
            return BinarySearchHelpIn2DArray(arr, rStart + 1, 0, cols - 1, target);
        }
    }
    static int[] BinarySearchHelpIn2DArray(int[][] arr,int row, int cStart,int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if(arr[row][mid] == target){
                return new int[]{row, mid};
            }
            else if(arr[row][mid] < target){
                cStart = mid + 1;
            }
            else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

}

