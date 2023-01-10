public class leetcodeDailyQuestion {
    public static void main(String[] args){
        int[] arr = {2, 3, 4, 5, 6};
        System.out.println(threeSumClosest(arr, 4));
    }
    static int threeSumClosest(int[] arr, int target) {
        int isum = arr[0] + arr[1] + arr[2];
        int idiff = Math.abs(target - isum);
        int sum = 0;
        int sum1 = 0;
        int diff = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(j != i) {
                    sum = arr[i] + arr[j];
                    for (int k = 0; k < arr.length; k++) {
                        if (k != i && k != j) {
                            sum1 = sum + arr[k];
                            diff = Math.abs(target - sum1);
                            if (diff < idiff) {
                                idiff = diff;
                                isum = sum1;
                            }
                        }

                    }
                }
            }
        }
        return isum;

    }
}
