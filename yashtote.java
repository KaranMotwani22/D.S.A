public class yashtote {
    public static void main(String[] args) {
        for(int x = 9; x >= 0; x--) {
            for (int y = 9; y >= 0; y--) {
                System.out.print(Integer.toHexString(x));
                System.out.print(Integer.toHexString(y));
                System.out.println("");
            }
        }


    }
}
