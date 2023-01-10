
public class SearchInMountainArray {

    public static void main(String args[]){
        int n=4;
        int number =1;

        for (int i=n;i>=1;i--){
            for (int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){  //no.printing
                System.out.print(number+"*");
                number++;
            }

            System.out.println();
        }


        for (int i=n;i>=1;i--){
            for (int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){  //no.printing
                System.out.print(number+"*");
                number++;
            }

            System.out.println();
        }

    }
}
