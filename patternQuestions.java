public class patternQuestions {
    public static void main(String[] args) {
        pattern30(4  );
    }
    static void patternA(int n) {
        for (int i = 1; i < 2 * n ; i++) {
            int totalColsinRow = i <= n ? i : 2*n - i;
            for(int j = 0; j < totalColsinRow; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void pattern28(int n){
        for(int i = 1; i < 2 * n; i++){
            int Spaces = Math.abs(n - i);
            int Stars = i <= n ? i : 2 * n - i;
            int total = Spaces + Stars;
            for(int j = 1; j <= total; j++){
                if(Spaces > 0){
                    System.out.print(" ");
                    Spaces--;
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
    static void pattern30(int n){
        for(int i = 0; i < n; i++) {
            int spaces = n - 1 - i;
            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }
            int numbers = 1 + (i * 2);
            int temp = 1;
            for (int k = 0; k < numbers; k++) {
                if(k <= numbers / 2) {
                    System.out.print(n - spaces - k + " ");
                }
                else{
                    System.out.print(k  + 1 - numbers / 2 + " ");
                }
            }
            System.out.println("");
        }

        }
    }
